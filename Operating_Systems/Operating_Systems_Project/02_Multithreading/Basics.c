#include <stdio.h>
#include <stdlib.h>
#include <pthread.h> //working with POSIX threads
#include <unistd.h>  //for sleep() and pause()

static void* thread_fn_callback(void* arg){
    char *input = (char*)arg;
    while(1){
        printf("input string = %s\n", input);
        sleep(1);
    }
}

void thread1_create(){

    pthread_t pthread1;  // thread handle

    static char *thread_input1 = "I am thread no 1";

    int rc = pthread_create(&pthread1, NULL, thread_fn_callback, (void*)thread_input1); //for point for child thread

    if(rc!=0){
        printf("Error in creating the Thread = %d\n", rc);
        exit(0);
    }

}

int main(int argc, char **argv){

    thread1_create();

    printf("main function paused\n");

    pause();


    return 0;
}

