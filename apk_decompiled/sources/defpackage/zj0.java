package defpackage;

import android.util.Log;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class zj0 {
    public static final zj0 a = new zj0();
    public static final ob0 b = new ob0();
    public static final ob0 c = new ob0();
    public static final ob0 d = new ob0();
    public static final ob0 e = new ob0();
    public static volatile vj0 f;
    public static volatile vj0 g;
    public static volatile vj0 h;
    public static volatile vj0 i;

    public static void a(String str) {
        str.getClass();
        try {
            Runtime.getRuntime().exec(new String[]{"su", "-c", str});
        } catch (Exception e2) {
            Log.e("RootUtils", "fireAsRoot failed: " + e2.getMessage());
        }
    }

    public static Object b(hm hmVar) {
        nq nqVar = nr.a;
        return p01.H(hq.d, new w2(2, 5, null), hmVar);
    }

    public static Object c(String str, boolean z, hm hmVar) {
        nq nqVar = nr.a;
        return p01.H(hq.d, new oe(str, z, (hm) null), hmVar);
    }

    public static Object d(String str, im imVar) {
        nq nqVar = nr.a;
        return p01.H(hq.d, new qe(str, (hm) null, 11), imVar);
    }

    public static String f(String str, wj0 wj0Var, boolean z) {
        vj0 vj0Var;
        int ordinal = wj0Var.ordinal();
        if (ordinal == 0) {
            vj0Var = f;
        } else if (ordinal == 1) {
            vj0Var = g;
        } else if (ordinal == 2) {
            vj0Var = h;
        } else {
            if (ordinal != 3) {
                o.n();
                return null;
            }
            vj0Var = i;
        }
        if (vj0Var == null || !vj0Var.a.isAlive()) {
            Log.d("RootUtils", "Spawning new " + wj0Var.name() + " su shell");
            String[] strArr = wj0Var == wj0.f ? new String[]{"su", "--mount-master"} : new String[]{"su"};
            Process start = new ProcessBuilder((String[]) Arrays.copyOf(strArr, strArr.length)).redirectErrorStream(true).start();
            start.getClass();
            vj0 vj0Var2 = new vj0(start, new DataOutputStream(start.getOutputStream()), new BufferedReader(new InputStreamReader(start.getInputStream())));
            int ordinal2 = wj0Var.ordinal();
            if (ordinal2 == 0) {
                f = vj0Var2;
            } else if (ordinal2 == 1) {
                g = vj0Var2;
            } else if (ordinal2 == 2) {
                h = vj0Var2;
            } else {
                if (ordinal2 != 3) {
                    o.n();
                    return null;
                }
                i = vj0Var2;
            }
            vj0Var = vj0Var2;
        }
        try {
            vj0Var.b.writeBytes(str + "\n");
            vj0Var.b.writeBytes("echo ---SINGULARITY_CMD_DONE_3f8a---\n");
            vj0Var.b.flush();
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = vj0Var.c.readLine();
                if (readLine == null || readLine.equals("---SINGULARITY_CMD_DONE_3f8a---")) {
                    break;
                }
                sb.append(readLine);
                sb.append('\n');
            }
            return ds0.F0(sb.toString()).toString();
        } catch (Exception e2) {
            try {
                int ordinal3 = wj0Var.ordinal();
                if (ordinal3 == 0) {
                    vj0 vj0Var3 = f;
                    if (vj0Var3 != null) {
                        vj0Var3.a.destroy();
                    }
                    f = null;
                } else if (ordinal3 == 1) {
                    vj0 vj0Var4 = g;
                    if (vj0Var4 != null) {
                        vj0Var4.a.destroy();
                    }
                    g = null;
                } else if (ordinal3 == 2) {
                    vj0 vj0Var5 = h;
                    if (vj0Var5 != null) {
                        vj0Var5.a.destroy();
                    }
                    h = null;
                } else {
                    if (ordinal3 != 3) {
                        throw new tj();
                    }
                    vj0 vj0Var6 = i;
                    if (vj0Var6 != null) {
                        vj0Var6.a.destroy();
                    }
                    i = null;
                }
            } catch (Exception unused) {
            }
            if (!z) {
                Log.e("RootUtils", "Shell threw during command and the retry on a fresh shell also failed", e2);
                throw e2;
            }
            String simpleName = e2.getClass().getSimpleName();
            String message = e2.getMessage();
            String name = wj0Var.name();
            StringBuilder k = j50.k("Shell died mid-command (", simpleName, ": ", message, ") -- rebuilding ");
            k.append(name);
            k.append(" shell and retrying once");
            Log.w("RootUtils", k.toString());
            return f(str, wj0Var, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, wj0 wj0Var, boolean z, im imVar) {
        xj0 xj0Var;
        int i2;
        ob0 ob0Var;
        try {
            if (imVar instanceof xj0) {
                xj0Var = (xj0) imVar;
                int i3 = xj0Var.i;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    xj0Var.i = i3 - Integer.MIN_VALUE;
                    Object obj = xj0Var.g;
                    i2 = xj0Var.i;
                    if (i2 != 0) {
                        p10.Q(obj);
                        if (z) {
                            wj0Var = wj0.f;
                        }
                        int ordinal = wj0Var.ordinal();
                        if (ordinal == 0) {
                            ob0Var = b;
                        } else if (ordinal == 1) {
                            ob0Var = c;
                        } else if (ordinal == 2) {
                            ob0Var = d;
                        } else {
                            if (ordinal != 3) {
                                o.n();
                                return null;
                            }
                            ob0Var = e;
                        }
                        xj0Var.d = str;
                        xj0Var.e = wj0Var;
                        xj0Var.f = ob0Var;
                        xj0Var.i = 1;
                        Object d2 = ob0Var.d(xj0Var);
                        vn vnVar = vn.d;
                        if (d2 == vnVar) {
                            return vnVar;
                        }
                    } else {
                        if (i2 != 1) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ob0 ob0Var2 = xj0Var.f;
                        wj0Var = xj0Var.e;
                        String str2 = xj0Var.d;
                        p10.Q(obj);
                        ob0Var = ob0Var2;
                        str = str2;
                    }
                    return f(str, wj0Var, true);
                }
            }
            return f(str, wj0Var, true);
        } finally {
            ob0Var.f(null);
        }
        xj0Var = new xj0(this, imVar);
        Object obj2 = xj0Var.g;
        i2 = xj0Var.i;
        if (i2 != 0) {
        }
    }
}
