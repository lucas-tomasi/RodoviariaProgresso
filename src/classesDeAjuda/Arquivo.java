package classesDeAjuda;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Lucas Tomasi
 */
public class Arquivo {

    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private String nomeArquivo;
    private char status;

    // Construtor
    // =======================================================================================

    /**
     *
     * @param nomeArquivo
     */
        public Arquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        status = 'C'; // Closed, Read, Write
    }

    // Abre arquivo para leitura
    // =======================================================================================  

    /**
     *
     * @return
     */
        public boolean abrirLeitura() {
        boolean sucesso = true;
        FileReader fileReader = null;
        if (status != 'C') {
            System.err.println("-- Arquivo \"" + nomeArquivo + "\" já está aberto");
            sucesso = false;
        } else {
            try {
                fileReader = new FileReader(nomeArquivo);
            } catch (FileNotFoundException e) {
                System.err.println("-- Arquivo \"" + nomeArquivo + "\" não encontrado");
                sucesso = false;
            }
            if (sucesso) {
                status = 'R';
                bufferedReader = new BufferedReader(fileReader);
            }
        }
        return (sucesso);
    }

    // Abre arquivo para escrita
    // =======================================================================================  

    /**
     *
     * @return
     */
        public boolean abrirEscrita() {
        boolean sucesso = true;
        FileWriter fileWriter = null;
        if (status != 'C') {
            System.err.println("-- Arquivo \"" + nomeArquivo + "\" já está aberto");
            sucesso = false;
        } else {
            try {
                fileWriter = new FileWriter(nomeArquivo);
            } catch (IOException e) {
                System.err.println("-- Erro de escrita no arquivo \"" + nomeArquivo + "\"");
                sucesso = false;
            }
            if (sucesso) {
                status = 'W';
                bufferedWriter = new BufferedWriter(fileWriter);
            }
        }
        return (sucesso);
    }

    // Lê linha por linha do arquivo aberto
    // =======================================================================================  

    /**
     *
     * @return
     */
        public String lerLinha() {
        String linha = " ";
        if (status == 'R') {
            try {
                linha = bufferedReader.readLine();
            } catch (IOException e) {
                System.err.println("-- Erro de leitura no arquivo \"" + nomeArquivo + "\"");
            }
        } else {
            System.err.println("-- Arquivo \"" + nomeArquivo + "\" não está pronto para leitura");
        }

        return (linha);
    }
    // Lê linha por linha do arquivo aberto
    // =======================================================================================  

    /**
     *
     * @return
     */
    public ArrayList<String>lerLinhas() {
        ArrayList linha = new ArrayList();        
        if (status == 'R') {
            try {
                while (bufferedReader.ready()) {
                    linha.add(bufferedReader.readLine());                    
                }
            } catch (IOException e) {
                System.err.println("-- Erro de leitura no arquivo \"" + nomeArquivo + "\"");
            }
        } else {
            System.err.println("-- Arquivo \"" + nomeArquivo + "\" não está pronto para leitura");
        }

        return (linha);
    }

    // Escreve uma linha no arquivo aberto
    // =======================================================================================  

    /**
     *
     * @param linha
     */
    
    public void escreverLinha(String linha) {
        if (status == 'W') {
            try {
                bufferedWriter.write(linha);
                bufferedWriter.newLine();
            } catch (IOException e) {
                System.err.println("Erro de escrita no arquivo \"" + nomeArquivo + "\"");
            }
        } else {
            System.err.println("-- Arquivo \"" + nomeArquivo + "\" não está pronto para escrita");
        }
    }

    // Fecha arquivo
    // =======================================================================================  

    /**
     *
     */
        public void fecharArquivo() {
        if (status == 'R') // estava aberto para leitura
        {
            try {
                bufferedReader.close();
                status = 'C';
            } catch (IOException e) {
                System.err.println("Erro ao fechar o arquivo \"" + nomeArquivo + "\"");
            }
        }
        if (status == 'W') // estava aberto para gravação
        {
            try {
                bufferedWriter.close();
                status = 'C';
            } catch (IOException e) {
                System.err.println("Erro ao fechar o arquivo \"" + nomeArquivo + "\"");
            }
        }
    }
}
