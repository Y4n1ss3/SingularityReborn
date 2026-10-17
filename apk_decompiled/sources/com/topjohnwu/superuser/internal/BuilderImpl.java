package com.topjohnwu.superuser.internal;

import android.content.Context;
import android.text.TextUtils;
import com.topjohnwu.superuser.NoShellException;
import com.topjohnwu.superuser.Shell;
import java.io.IOException;
import java.lang.reflect.Constructor;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class BuilderImpl extends Shell.Builder {
    private static final String TAG = "BUILDER";
    private Shell.Initializer[] initializers;
    long timeout = 20;
    private int flags = 0;

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r1.isRoot() == false) goto L9;
     */
    @Override // com.topjohnwu.superuser.Shell.Builder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ShellImpl build() {
        ShellImpl shellImpl;
        if (!hasFlags(1) && hasFlags(2)) {
            try {
                shellImpl = build("su", "--mount-master");
            } catch (NoShellException unused) {
            }
        }
        shellImpl = null;
        if (shellImpl == null && !hasFlags(1)) {
            try {
                shellImpl = build("su");
                shellImpl = shellImpl.isRoot() ? shellImpl : null;
            } catch (NoShellException unused2) {
            }
        }
        if (shellImpl != null) {
            return shellImpl;
        }
        if (!hasFlags(1)) {
            Utils.setConfirmedRootState(false);
        }
        return build("sh");
    }

    public boolean hasFlags(int i) {
        return (this.flags & i) == i;
    }

    @Override // com.topjohnwu.superuser.Shell.Builder
    public Shell.Builder setFlags(int i) {
        this.flags = i;
        return this;
    }

    public void setInitializersImpl(Class<? extends Shell.Initializer>[] clsArr) {
        this.initializers = new Shell.Initializer[clsArr.length];
        for (int i = 0; i < clsArr.length; i++) {
            try {
                Constructor<? extends Shell.Initializer> declaredConstructor = clsArr[i].getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                this.initializers[i] = declaredConstructor.newInstance(null);
            } catch (ClassCastException | ReflectiveOperationException e) {
                Utils.err(e);
            }
        }
    }

    @Override // com.topjohnwu.superuser.Shell.Builder
    public Shell.Builder setTimeout(long j) {
        this.timeout = j;
        return this;
    }

    @Override // com.topjohnwu.superuser.Shell.Builder
    public ShellImpl build(String... strArr) {
        try {
            TextUtils.join(" ", strArr);
            return build(Runtime.getRuntime().exec(strArr));
        } catch (IOException e) {
            throw new NoShellException("Unable to create a shell!", e);
        }
    }

    @Override // com.topjohnwu.superuser.Shell.Builder
    public ShellImpl build(Process process) {
        try {
            ShellImpl shellImpl = new ShellImpl(this, process);
            MainShell.setCached(shellImpl);
            if (this.initializers != null) {
                Context context = Utils.getContext();
                for (Shell.Initializer initializer : this.initializers) {
                    if (initializer != null && !initializer.onInit(context, shellImpl)) {
                        MainShell.setCached(null);
                        throw new NoShellException("Unable to init shell");
                    }
                }
            }
            return shellImpl;
        } catch (IOException e) {
            throw new NoShellException("Unable to create a shell!", e);
        }
    }
}
