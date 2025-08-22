package com.wolf.wxaiagent.demo.invoke;

import dev.langchain4j.community.model.dashscope.QwenChatModel;

/**
 * 通过 LangChain4j 接入 AI 大模型
 */
public class LangChainAiInvoke {

    public static void main(String[] args) {
        QwenChatModel qwenChatModel = QwenChatModel.builder()
                .apiKey(System.getenv("DASHSCOPE_API_KEY"))
                .modelName("qwen-plus")
                .build();

        String answer = qwenChatModel.chat("Say 'Hello World'");
        System.out.println(answer);
    }
}
