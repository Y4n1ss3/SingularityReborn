package defpackage;

import androidx.compose.runtime.MutableState;
import org.json.JSONObject;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class zz0 extends us0 implements my {
    public final /* synthetic */ int d = 1;
    public int e;
    public /* synthetic */ boolean f;
    public final /* synthetic */ my g;
    public final /* synthetic */ MutableState h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zz0(boolean z, my myVar, MutableState mutableState, hm hmVar) {
        super(2, hmVar);
        this.f = z;
        this.g = myVar;
        this.h = mutableState;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        switch (this.d) {
            case 0:
                return new zz0(this.f, this.g, this.h, hmVar);
            default:
                zz0 zz0Var = new zz0(this.g, this.h, hmVar);
                zz0Var.f = ((Boolean) obj).booleanValue();
                return zz0Var;
        }
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        w01 w01Var = w01.a;
        switch (i) {
            case 0:
                return ((zz0) create((un) obj, (hm) obj2)).invokeSuspend(w01Var);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((zz0) create(bool, (hm) obj2)).invokeSuspend(w01Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c3, code lost:
    
        if (defpackage.zj0.c(r15, true, r14) == r4) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0059, code lost:
    
        if (r15 == r4) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        JSONObject jSONObject;
        int i = this.d;
        w01 w01Var = w01.a;
        MutableState mutableState = this.h;
        vn vnVar = vn.d;
        my myVar = this.g;
        switch (i) {
            case 0:
                int i2 = this.e;
                if (i2 == 0) {
                    p10.Q(obj);
                    boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                    boolean z = this.f;
                    String str = booleanValue ? z ? "oculuspreferences --setc debug_disable_shell_transition_animations true\nam force-stop com.oculus.vrshell" : "oculuspreferences --setc debug_disable_shell_transition_animations false\nam force-stop com.oculus.vrshell" : z ? "oculuspreferences --setc shell_immersive_transitions_enabled false\nam force-stop com.oculus.vrshell" : "oculuspreferences --setc shell_immersive_transitions_enabled true\nam force-stop com.oculus.vrshell";
                    this.e = 1;
                    if (myVar.invoke(str, this) == vnVar) {
                        break;
                    }
                } else if (i2 != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    p10.Q(obj);
                    break;
                }
                break;
            default:
                boolean z2 = this.f;
                int i3 = this.e;
                if (i3 != 0) {
                    if (i3 != 1 && i3 != 2) {
                        if (i3 == 3) {
                            p10.Q(obj);
                            String str2 = (String) obj;
                            if (ds0.n0(str2) || ds0.g0(str2, "No such file", false)) {
                                jSONObject = new JSONObject();
                            } else {
                                try {
                                    jSONObject = new JSONObject(str2);
                                } catch (Exception unused) {
                                    jSONObject = new JSONObject();
                                }
                            }
                            JSONObject optJSONObject = jSONObject.optJSONObject("systemConfiguration");
                            if (optJSONObject == null) {
                                optJSONObject = new JSONObject();
                            }
                            optJSONObject.put("navigatorEnabled", z2);
                            jSONObject.put("systemConfiguration", optJSONObject);
                            zj0 zj0Var = zj0.a;
                            zj0.a("oculuspreferences --setc debug_enable_boot_configuration_overrides true");
                            zj0.a("echo '" + jSONObject.toString(4) + "' > /sdcard/boot_config.json");
                            String str3 = z2 ? "FILE=/data/data/com.oculus.vrshell/files/deviceconfig_cache_v2.txt\nchattr -i \"$FILE\"\nsed -i '/^oculus_systemshell:oculus_vrshell_is_navigator_enabled,/s/,[^,]*$/,true/' \"$FILE\"\nsed -i '/^oculus_systemshell:oculus_vrshell_cold_boot_invoke_navigator,/s/,[^,]*$/,true/' \"$FILE\"\nsed -i '/^oculus_systemshell:oculus_vrshell_navigator_invoke_on_last_panel_closed,/s/,[^,]*$/,true/' \"$FILE\"\nsed -i '/^oculus_systemshell:oculus_vrshell_navigator_keep_visible_on_quit,/s/,[^,]*$/,true/' \"$FILE\"\nsed -i '/^oculus_systemshell:oculus_vrshell_control_bar_kondo,/s/,[^,]*$/,true/' \"$FILE\"\nchattr +i \"$FILE\"\npm enable com.oculus.systemux/com.oculus.common.navigatoritempinningservice.NavigatorItemPinningService" : "FILE=/data/data/com.oculus.vrshell/files/deviceconfig_cache_v2.txt\nchattr -i \"$FILE\"\nsed -i '/^oculus_systemshell:oculus_vrshell_is_navigator_enabled,/s/,[^,]*$/,false/' \"$FILE\"\nsed -i '/^oculus_systemshell:oculus_vrshell_cold_boot_invoke_navigator,/s/,[^,]*$/,false/' \"$FILE\"\nsed -i '/^oculus_systemshell:oculus_vrshell_navigator_invoke_on_last_panel_closed,/s/,[^,]*$/,false/' \"$FILE\"\nsed -i '/^oculus_systemshell:oculus_vrshell_navigator_keep_visible_on_quit,/s/,[^,]*$/,false/' \"$FILE\"\nsed -i '/^oculus_systemshell:oculus_vrshell_control_bar_kondo,/s/,[^,]*$/,false/' \"$FILE\"\nchattr +i \"$FILE\"\npm disable com.oculus.systemux/com.oculus.common.navigatoritempinningservice.NavigatorItemPinningService";
                            this.f = z2;
                            this.e = 4;
                            break;
                        } else if (i3 == 4) {
                            p10.Q(obj);
                            this.f = z2;
                            this.e = 5;
                            if (myVar.invoke("am force-stop com.oculus.vrshell", this) != vnVar) {
                            }
                            break;
                        } else if (i3 != 5) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            break;
                        }
                    }
                    p10.Q(obj);
                    break;
                } else {
                    p10.Q(obj);
                    int ordinal = ((yr0) mutableState.getValue()).ordinal();
                    if (ordinal == 0) {
                        String str4 = z2 ? "oculuspreferences --setc debug_navigator_state 1\nam force-stop com.oculus.vrshell" : "oculuspreferences --setc debug_navigator_state 0\nam force-stop com.oculus.vrshell";
                        this.f = z2;
                        this.e = 1;
                        if (myVar.invoke(str4, this) != vnVar) {
                        }
                    } else if (ordinal == 1) {
                        String str5 = z2 ? "oculuspreferences --setc debug_navigator_state_v1 1\nam force-stop com.oculus.vrshell" : "oculuspreferences --setc debug_navigator_state_v1 0\nam force-stop com.oculus.vrshell";
                        this.f = z2;
                        this.e = 2;
                        if (myVar.invoke(str5, this) != vnVar) {
                        }
                    } else if (ordinal == 2) {
                        zj0 zj0Var2 = zj0.a;
                        this.f = z2;
                        this.e = 3;
                        obj = zj0.c("cat /sdcard/boot_config.json 2>/dev/null", false, this);
                        break;
                    } else {
                        o.n();
                    }
                }
                break;
        }
        return vnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zz0(my myVar, MutableState mutableState, hm hmVar) {
        super(2, hmVar);
        this.g = myVar;
        this.h = mutableState;
    }
}
