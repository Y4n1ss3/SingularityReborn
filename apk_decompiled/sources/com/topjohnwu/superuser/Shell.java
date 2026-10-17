package com.topjohnwu.superuser;

import android.content.Context;
import androidx.compose.runtime.snapshots.SnapshotId_jvmKt;
import com.topjohnwu.superuser.internal.BuilderImpl;
import com.topjohnwu.superuser.internal.MainShell;
import com.topjohnwu.superuser.internal.UiThreadHandler;
import com.topjohnwu.superuser.internal.Utils;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class Shell implements Closeable {
    public static final int FLAG_MOUNT_MASTER = 2;
    public static final int FLAG_NON_ROOT_SHELL = 1;
    public static final int FLAG_REDIRECT_STDERR = 8;
    public static final int NON_ROOT_SHELL = 0;

    @Deprecated
    public static final int ROOT_MOUNT_MASTER = 2;
    public static final int ROOT_SHELL = 1;
    public static final int UNKNOWN = -1;
    public static ExecutorService EXECUTOR = Executors.newCachedThreadPool();
    public static boolean enableVerboseLogging = false;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static abstract class Builder {
        public static Builder create() {
            return new BuilderImpl();
        }

        public abstract Shell build();

        public abstract Shell build(Process process);

        public abstract Shell build(String... strArr);

        public final Builder setContext(Context context) {
            Utils.setContext(context);
            return this;
        }

        public abstract Builder setFlags(int i);

        @SafeVarargs
        public final Builder setInitializers(Class<? extends Initializer>... clsArr) {
            ((BuilderImpl) this).setInitializersImpl(clsArr);
            return this;
        }

        public abstract Builder setTimeout(long j);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public interface GetShellCallback {
        void onShell(Shell shell);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static class Initializer {
        public boolean onInit(Context context, Shell shell) {
            return true;
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static abstract class Result {
        public static final int JOB_NOT_EXECUTED = -1;

        public abstract int getCode();

        public abstract List<String> getErr();

        public abstract List<String> getOut();

        public boolean isSuccess() {
            return getCode() == 0;
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public interface ResultCallback {
        void onResult(Result result);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public interface Task {
        void run(OutputStream outputStream, InputStream inputStream, InputStream inputStream2);
    }

    public static Job cmd(String... strArr) {
        return MainShell.newJob(false, strArr);
    }

    public static Shell getCachedShell() {
        return MainShell.getCached();
    }

    public static void getShell(GetShellCallback getShellCallback) {
        MainShell.get(UiThreadHandler.executor, getShellCallback);
    }

    public static Boolean isAppGrantedRoot() {
        return Utils.isAppGrantedRoot();
    }

    @Deprecated
    public static boolean rootAccess() {
        return Objects.equals(isAppGrantedRoot(), Boolean.TRUE);
    }

    public static void setDefaultBuilder(Builder builder) {
        MainShell.setBuilder(builder);
    }

    @Deprecated
    public static Job sh(String... strArr) {
        return MainShell.newJob(false, strArr);
    }

    @Deprecated
    public static Job su(String... strArr) {
        return MainShell.newJob(true, strArr);
    }

    public abstract void execTask(Task task);

    public abstract int getStatus();

    public abstract boolean isAlive();

    public boolean isRoot() {
        return getStatus() >= 1;
    }

    public abstract Job newJob();

    public void waitAndClose() {
        while (!waitAndClose(SnapshotId_jvmKt.SnapshotIdMax, TimeUnit.NANOSECONDS)) {
        }
    }

    public abstract boolean waitAndClose(long j, TimeUnit timeUnit);

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static abstract class Job {
        public abstract Job add(InputStream inputStream);

        public abstract Job add(String... strArr);

        public abstract Future<Result> enqueue();

        public abstract Result exec();

        public final void submit(ResultCallback resultCallback) {
            submit(UiThreadHandler.executor, resultCallback);
        }

        public abstract void submit(Executor executor, ResultCallback resultCallback);

        public abstract Job to(List<String> list);

        public abstract Job to(List<String> list, List<String> list2);

        public final void submit() {
            submit(null);
        }
    }

    public static Job cmd(InputStream inputStream) {
        return MainShell.newJob(false, inputStream);
    }

    public static Shell getShell() {
        return MainShell.get();
    }

    @Deprecated
    public static Job sh(InputStream inputStream) {
        return MainShell.newJob(false, inputStream);
    }

    @Deprecated
    public static Job su(InputStream inputStream) {
        return MainShell.newJob(true, inputStream);
    }

    public static void getShell(Executor executor, GetShellCallback getShellCallback) {
        MainShell.get(executor, getShellCallback);
    }
}
