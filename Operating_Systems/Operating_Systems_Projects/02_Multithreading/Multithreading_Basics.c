#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>   //for thread creation
#include <unistd.h>    //pause() & sleep()

static void* thread_fn_callback(void* str)
{
    int i=0;
    char *agr = (char*)str;
    while(i<10)
    {
    printf("%s",agr);
    sleep(1);
    i++;
    }
}

void thread_create()
{
    pthread_t thread1;

    static char* str = "Child thread is running";

    int rc = pthread_create(&thread1,NULL,thread_fn_callback,(void*) str);

    if(rc!=0)
    {
        printf("The error code is %d\n",rc);
        exit(0);
    }


}

int main()
{
    thread_create();

    printf("Main Thread is stopped here\n");
    pause();

    return 0;
}