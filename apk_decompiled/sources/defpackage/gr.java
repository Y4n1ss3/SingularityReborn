package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class gr {
    public final Executor a;
    public final ig0 b;
    public final byte[] c;
    public final File d;
    public final String e;
    public boolean f = false;
    public ir[] g;
    public byte[] h;

    public gr(AssetManager assetManager, Executor executor, ig0 ig0Var, String str, File file) {
        this.a = executor;
        this.b = ig0Var;
        this.e = str;
        this.d = file;
        int i = Build.VERSION.SDK_INT;
        this.c = i >= 31 ? q10.h : (i == 29 || i == 30) ? q10.i : null;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.b.c();
            return null;
        }
    }

    public final void b(final int i, final Serializable serializable) {
        this.a.execute(new Runnable() { // from class: fr
            @Override // java.lang.Runnable
            public final void run() {
                gr.this.b.d(i, serializable);
            }
        });
    }
}
