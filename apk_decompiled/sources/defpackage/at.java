package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class at {
    public static final Object j = new Object();
    public static volatile at k;
    public final ReentrantReadWriteLock a;
    public final zb b;
    public volatile int c;
    public final Handler d;
    public final xs e;
    public final zs f;
    public final ts g;
    public final int h;
    public final gq i;

    public at(ux uxVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        zs zsVar = uxVar.a;
        this.f = zsVar;
        int i = uxVar.b;
        this.h = i;
        this.i = uxVar.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new zb();
        this.g = new ts(16);
        xs xsVar = new xs(this);
        this.e = xsVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            try {
                zsVar.a(new ws(xsVar));
            } catch (Throwable th2) {
                f(th2);
            }
        }
    }

    public static at a() {
        at atVar;
        synchronized (j) {
            try {
                atVar = k;
                if (!(atVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return atVar;
    }

    public static boolean d() {
        return k != null;
    }

    public final int b(CharSequence charSequence, int i) {
        if (!(c() == 1)) {
            o.f("Not initialized yet");
            return 0;
        }
        d41.e(charSequence, "charSequence cannot be null");
        c8 c8Var = this.e.b;
        c8Var.getClass();
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            s01[] s01VarArr = (s01[]) spanned.getSpans(i, i + 1, s01.class);
            if (s01VarArr.length > 0) {
                return spanned.getSpanStart(s01VarArr[0]);
            }
        }
        return ((lt) c8Var.j(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new lt(i))).b;
    }

    public final int c() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void e() {
        if (!(this.h == 1)) {
            o.f("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
            return;
        }
        if (c() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            xs xsVar = this.e;
            at atVar = xsVar.a;
            try {
                atVar.f.a(new ws(xsVar));
            } catch (Throwable th) {
                atVar.f(th);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new r7(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009c A[Catch: all -> 0x007f, TryCatch #3 {all -> 0x007f, blocks: (B:88:0x0057, B:91:0x005c, B:93:0x0060, B:95:0x006d, B:35:0x008c, B:37:0x0096, B:39:0x0099, B:41:0x009c, B:43:0x00ac, B:44:0x00af), top: B:87:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence g(CharSequence charSequence, int i, int i2, int i3) {
        CharSequence charSequence2;
        Throwable th;
        int i4;
        int i5;
        s01[] s01VarArr;
        y01 y01Var = null;
        if (!(c() == 1)) {
            o.f("Not initialized yet");
            return null;
        }
        if (i < 0) {
            o.m("start cannot be negative");
            return null;
        }
        if (i2 < 0) {
            o.m("end cannot be negative");
            return null;
        }
        if (!(i <= i2)) {
            o.m("start should be <= than end");
            return null;
        }
        if (charSequence == null) {
            return null;
        }
        if (!(i <= charSequence.length())) {
            o.m("start should be < than charSequence length");
            return null;
        }
        if (!(i2 <= charSequence.length())) {
            o.m("end should be < than charSequence length");
            return null;
        }
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        boolean z = i3 == 1;
        c8 c8Var = this.e.b;
        c8Var.getClass();
        boolean z2 = charSequence instanceof jr0;
        if (z2) {
            ((jr0) charSequence).a();
        }
        try {
            if (!z2) {
                try {
                    if (!(charSequence instanceof Spannable)) {
                        if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, s01.class) <= i2) {
                            y01Var = new y01();
                            y01Var.d = false;
                            y01Var.e = new SpannableString(charSequence);
                        }
                        if (y01Var != null && (s01VarArr = (s01[]) y01Var.e.getSpans(i, i2, s01.class)) != null && s01VarArr.length > 0) {
                            for (s01 s01Var : s01VarArr) {
                                int spanStart = y01Var.e.getSpanStart(s01Var);
                                int spanEnd = y01Var.e.getSpanEnd(s01Var);
                                if (spanStart != i2) {
                                    y01Var.removeSpan(s01Var);
                                }
                                i = Math.min(spanStart, i);
                                i2 = Math.max(spanEnd, i2);
                            }
                        }
                        i4 = i;
                        i5 = i2;
                        if (i4 != i5 || i4 >= charSequence.length()) {
                            charSequence2 = charSequence;
                            if (!z2) {
                                return charSequence2;
                            }
                        } else {
                            try {
                                charSequence2 = charSequence;
                            } catch (Throwable th2) {
                                charSequence2 = charSequence;
                                th = th2;
                                if (z2) {
                                }
                            }
                            try {
                                y01 y01Var2 = (y01) c8Var.j(charSequence2, i4, i5, Integer.MAX_VALUE, z, new bg(y01Var, (ts) c8Var.a));
                                if (y01Var2 != null) {
                                    Spannable spannable = y01Var2.e;
                                    if (z2) {
                                        ((jr0) charSequence2).b();
                                    }
                                    return spannable;
                                }
                                if (!z2) {
                                    return charSequence2;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                th = th;
                                if (z2) {
                                }
                            }
                        }
                        ((jr0) charSequence2).b();
                        return charSequence2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    charSequence2 = charSequence;
                    if (z2) {
                    }
                }
            }
            y01Var = new y01((Spannable) charSequence);
            if (y01Var != null) {
                while (r1 < r0) {
                }
            }
            i4 = i;
            i5 = i2;
            if (i4 != i5) {
            }
            charSequence2 = charSequence;
            if (!z2) {
            }
            ((jr0) charSequence2).b();
            return charSequence2;
        } catch (Throwable th5) {
            th = th5;
            charSequence2 = charSequence;
            th = th;
            if (z2) {
                throw th;
            }
            ((jr0) charSequence2).b();
            throw th;
        }
    }

    public final void h(ys ysVar) {
        this.a.writeLock().lock();
        try {
            if (this.c != 1 && this.c != 2) {
                this.b.add(ysVar);
                this.a.writeLock().unlock();
            }
            this.d.post(new r7(Arrays.asList(ysVar), this.c, (Throwable) null));
            this.a.writeLock().unlock();
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public final void i(EditorInfo editorInfo) {
        if (c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        xs xsVar = this.e;
        xsVar.getClass();
        Bundle bundle = editorInfo.extras;
        d90 d90Var = (d90) xsVar.c.a;
        int a = d90Var.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a != 0 ? ((ByteBuffer) d90Var.g).getInt(a + d90Var.d) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
