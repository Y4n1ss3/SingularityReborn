package defpackage;

import android.content.SharedPreferences;
import android.util.Log;
import androidx.compose.runtime.MutableState;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class b01 extends us0 implements my {
    public final /* synthetic */ int d;
    public int e;
    public int f;
    public Object g;
    public Object h;
    public /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b01(rw0 rw0Var, SharedPreferences sharedPreferences, MutableState mutableState, ky kyVar, hm hmVar, int i) {
        super(2, hmVar);
        this.d = i;
        this.g = rw0Var;
        this.h = sharedPreferences;
        this.i = mutableState;
        this.j = kyVar;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        int i = this.d;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                return new b01((rw0) this.g, (SharedPreferences) this.h, (MutableState) this.i, (ky) obj2, hmVar, 0);
            case 1:
                return new b01((rw0) this.g, (SharedPreferences) this.h, (MutableState) this.i, (ky) obj2, hmVar, 1);
            case 2:
                return new b01((rw0) this.g, (SharedPreferences) this.h, (MutableState) this.i, (ky) obj2, hmVar, 2);
            default:
                b01 b01Var = new b01((InputStream) obj2, hmVar);
                b01Var.i = obj;
                return b01Var;
        }
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        w01 w01Var = w01.a;
        switch (i) {
            case 0:
                return ((b01) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
            case 1:
                return ((b01) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
            case 2:
                return ((b01) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
            default:
                return ((b01) create((jw) obj, (hm) obj2)).invokeSuspend(w01Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0181, code lost:
    
        if (defpackage.p01.H(r12, r9, r11) == r6) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0227, code lost:
    
        if (defpackage.p01.H(r5, r9, r11) == r6) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e6, code lost:
    
        if (defpackage.p01.H(r12, r9, r11) == r6) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01aa  */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.BufferedReader, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v9, types: [boolean, int] */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        ?? r5;
        int i2;
        String str;
        ?? r52;
        int i3;
        String str2;
        Closeable bufferedReader;
        int i4;
        ?? r3;
        String str3;
        int i5 = this.d;
        Object obj2 = w01.a;
        Object obj3 = this.j;
        String str4 = "call to 'resume' before 'invoke' with coroutine";
        Object obj4 = vn.d;
        switch (i5) {
            case 0:
                ky kyVar = (ky) obj3;
                MutableState mutableState = (MutableState) this.i;
                int i6 = this.f;
                if (i6 == 0) {
                    p10.Q(obj);
                    boolean z = !((Boolean) mutableState.getValue()).booleanValue();
                    mutableState.setValue(Boolean.valueOf(z));
                    try {
                        boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                        rw0 rw0Var = (rw0) this.g;
                        if (!booleanValue) {
                            rw0.a(rw0Var, "com.lumi.singularity.STOP_MIN_FREQ");
                            nq nqVar = nr.a;
                            rz rzVar = f80.a;
                            z60 z60Var = new z60(6, null, kyVar);
                            this.e = z ? 1 : 0;
                            this.f = 2;
                            break;
                        } else {
                            rw0.a(rw0Var, "com.lumi.singularity.START_MIN_FREQ");
                            nq nqVar2 = nr.a;
                            rz rzVar2 = f80.a;
                            z60 z60Var2 = new z60(5, null, kyVar);
                            this.e = z ? 1 : 0;
                            this.f = 1;
                            if (p01.H(rzVar2, z60Var2, this) == obj4) {
                                return obj4;
                            }
                            i = z ? 1 : 0;
                        }
                    } catch (Exception unused) {
                        i = z ? 1 : 0;
                        mutableState.setValue(Boolean.valueOf(i == 0));
                        return obj2;
                    }
                } else {
                    if (i6 != 1 && i6 != 2) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = this.e;
                    try {
                        p10.Q(obj);
                    } catch (Exception unused2) {
                        mutableState.setValue(Boolean.valueOf(i == 0));
                        return obj2;
                    }
                }
                ((SharedPreferences) this.h).edit().putBoolean("min_freq_is_running", ((Boolean) mutableState.getValue()).booleanValue()).apply();
                return obj2;
            case 1:
                ky kyVar2 = (ky) obj3;
                MutableState mutableState2 = (MutableState) this.i;
                int i7 = this.f;
                if (i7 == 0) {
                    p10.Q(obj);
                    boolean booleanValue2 = ((Boolean) mutableState2.getValue()).booleanValue();
                    r5 = !booleanValue2;
                    mutableState2.setValue(Boolean.valueOf((boolean) r5));
                    rw0 rw0Var2 = (rw0) this.g;
                    try {
                        if (booleanValue2) {
                            rw0.a(rw0Var2, "com.lumi.singularity.STOP_MAX_FREQ");
                            nq nqVar3 = nr.a;
                            rz rzVar3 = f80.a;
                            z60 z60Var3 = new z60(8, null, kyVar2);
                            this.e = r5;
                            this.f = 2;
                            break;
                        } else {
                            rw0.a(rw0Var2, "com.lumi.singularity.START_MAX_FREQ");
                            nq nqVar4 = nr.a;
                            rz rzVar4 = f80.a;
                            z60 z60Var4 = new z60(7, null, kyVar2);
                            this.e = r5;
                            this.f = 1;
                            if (p01.H(rzVar4, z60Var4, this) == obj4) {
                                obj2 = obj4;
                                r5 = r5;
                                return obj2;
                            }
                            i2 = r5;
                            str = r5;
                        }
                    } catch (Exception e) {
                        e = e;
                        i2 = r5;
                        Log.e("TweaksActivity", "Failed to toggle CPU Max Freq script", e);
                        mutableState2.setValue(Boolean.valueOf(i2 == 0));
                        return obj2;
                    }
                } else {
                    if (i7 != 1 && i7 != 2) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = this.e;
                    try {
                        p10.Q(obj);
                        str = str4;
                    } catch (Exception e2) {
                        e = e2;
                        Log.e("TweaksActivity", "Failed to toggle CPU Max Freq script", e);
                        mutableState2.setValue(Boolean.valueOf(i2 == 0));
                        return obj2;
                    }
                }
                ((SharedPreferences) this.h).edit().putBoolean("max_freq_is_running", ((Boolean) mutableState2.getValue()).booleanValue()).apply();
                r5 = str;
                return obj2;
            case 2:
                ky kyVar3 = (ky) obj3;
                MutableState mutableState3 = (MutableState) this.i;
                int i8 = this.f;
                if (i8 == 0) {
                    p10.Q(obj);
                    boolean booleanValue3 = ((Boolean) mutableState3.getValue()).booleanValue();
                    r52 = !booleanValue3;
                    mutableState3.setValue(Boolean.valueOf((boolean) r52));
                    rw0 rw0Var3 = (rw0) this.g;
                    try {
                        if (booleanValue3) {
                            rw0.a(rw0Var3, "com.lumi.singularity.STOP_GPU_MIN_FREQ");
                            nq nqVar5 = nr.a;
                            rz rzVar5 = f80.a;
                            z60 z60Var5 = new z60(10, null, kyVar3);
                            this.e = r52;
                            this.f = 2;
                            break;
                        } else {
                            rw0.a(rw0Var3, "com.lumi.singularity.START_GPU_MIN_FREQ");
                            nq nqVar6 = nr.a;
                            rz rzVar6 = f80.a;
                            z60 z60Var6 = new z60(9, null, kyVar3);
                            this.e = r52;
                            this.f = 1;
                            if (p01.H(rzVar6, z60Var6, this) == obj4) {
                                obj2 = obj4;
                                r52 = r52;
                                return obj2;
                            }
                            i3 = r52;
                            str2 = r52;
                        }
                    } catch (Exception unused3) {
                        i3 = r52;
                        mutableState3.setValue(Boolean.valueOf(i3 == 0));
                        return obj2;
                    }
                } else {
                    if (i8 != 1 && i8 != 2) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = this.e;
                    try {
                        p10.Q(obj);
                        str2 = str4;
                    } catch (Exception unused4) {
                        mutableState3.setValue(Boolean.valueOf(i3 == 0));
                        return obj2;
                    }
                }
                ((SharedPreferences) this.h).edit().putBoolean("gpu_min_freq_is_running", ((Boolean) mutableState3.getValue()).booleanValue()).apply();
                r52 = str2;
                return obj2;
            default:
                jw jwVar = (jw) this.i;
                int i9 = this.f;
                if (i9 == 0) {
                    p10.Q(obj);
                    Charset charset = StandardCharsets.UTF_8;
                    charset.getClass();
                    bufferedReader = new BufferedReader(new InputStreamReader((InputStream) obj3, charset), 8192);
                    i4 = 0;
                    r3 = bufferedReader;
                } else {
                    if (i9 != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i10 = this.e;
                    BufferedReader bufferedReader2 = (BufferedReader) this.h;
                    bufferedReader = (Closeable) this.g;
                    try {
                        p10.Q(obj);
                        i4 = i10;
                        r3 = bufferedReader2;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            q10.g(bufferedReader, th);
                            throw th2;
                        }
                    }
                }
                while (cq.x(getContext())) {
                    try {
                        str3 = r3.readLine();
                    } catch (IOException unused5) {
                        str3 = null;
                    }
                    if (str3 == null) {
                        q10.g(bufferedReader, null);
                        return obj2;
                    }
                    this.i = jwVar;
                    this.g = bufferedReader;
                    this.h = r3;
                    this.e = i4;
                    this.f = 1;
                    if (jwVar.emit(str3, this) == obj4) {
                        return obj4;
                    }
                }
                q10.g(bufferedReader, null);
                return obj2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b01(InputStream inputStream, hm hmVar) {
        super(2, hmVar);
        this.d = 3;
        this.j = inputStream;
    }
}
