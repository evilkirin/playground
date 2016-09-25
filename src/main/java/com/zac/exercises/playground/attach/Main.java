package com.zac.exercises.playground.attach;

import com.sun.tools.attach.VirtualMachine;

public class Main {
    public static void main(String[] args) throws Exception {
        VirtualMachine vm = null;
        String agentjarpath = "/Users/zac-tse/Development/github/playground/out/artifacts/TestAgent/TestAgent.jar"; //agentjar路径
        vm = VirtualMachine.attach("7820");//目标JVM的进程ID（PID）
        vm.loadAgent(agentjarpath, "This is Args to the Agent.");
        vm.detach();
    }
}