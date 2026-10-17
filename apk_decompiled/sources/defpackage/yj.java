package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class yj {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public ArrayList d = new ArrayList();
    public final transient HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final Bundle g = new Bundle();
    public final /* synthetic */ vu0 h;

    public yj(vu0 vu0Var) {
        this.h = vu0Var;
    }

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        z1 z1Var = (z1) this.e.get(str);
        if (z1Var != null) {
            u1 u1Var = z1Var.a;
            if (this.d.contains(str)) {
                u1Var.a(z1Var.b.H(i2, intent));
                this.d.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new t1(i2, intent));
        return true;
    }

    public final void b(int i, y80 y80Var, Object obj) {
        Bundle bundle;
        int i2;
        vu0 vu0Var = this.h;
        y80Var.y(vu0Var, obj);
        Intent n = y80Var.n(vu0Var, obj);
        if (n.getExtras() != null && n.getExtras().getClassLoader() == null) {
            n.setExtrasClassLoader(vu0Var.getClassLoader());
        }
        if (n.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = n.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            n.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(n.getAction())) {
            String[] stringArrayExtra = n.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            HashSet hashSet = new HashSet();
            for (int i3 = 0; i3 < stringArrayExtra.length; i3++) {
                if (TextUtils.isEmpty(stringArrayExtra[i3])) {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(stringArrayExtra) + " must not contain null or empty values");
                }
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i3], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i3));
                }
            }
            int size = hashSet.size();
            String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
            if (size > 0) {
                if (size == stringArrayExtra.length) {
                    return;
                }
                int i4 = 0;
                for (int i5 = 0; i5 < stringArrayExtra.length; i5++) {
                    if (!hashSet.contains(Integer.valueOf(i5))) {
                        strArr[i4] = stringArrayExtra[i5];
                        i4++;
                    }
                }
            }
            vu0Var.requestPermissions(stringArrayExtra, i);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(n.getAction())) {
            vu0Var.startActivityForResult(n, i, bundle2);
            return;
        }
        o10 o10Var = (o10) n.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            i2 = i;
            try {
                vu0Var.startIntentSenderForResult(o10Var.d, i2, o10Var.e, o10Var.f, o10Var.g, 0, bundle2);
            } catch (IntentSender.SendIntentException e) {
                e = e;
                new Handler(Looper.getMainLooper()).post(new r7(this, i2, e));
            }
        } catch (IntentSender.SendIntentException e2) {
            e = e2;
            i2 = i;
        }
    }

    public final void c(String str) {
        HashMap hashMap = this.b;
        if (((Integer) hashMap.get(str)) != null) {
            return;
        }
        b0 b0Var = xh0.d;
        int nextInt = xh0.d.a().nextInt(2147418112);
        while (true) {
            int i = nextInt + 65536;
            Integer valueOf = Integer.valueOf(i);
            HashMap hashMap2 = this.a;
            if (!hashMap2.containsKey(valueOf)) {
                hashMap2.put(Integer.valueOf(i), str);
                hashMap.put(str, Integer.valueOf(i));
                return;
            } else {
                b0 b0Var2 = xh0.d;
                nextInt = xh0.d.a().nextInt(2147418112);
            }
        }
    }

    public final void d(String str) {
        Integer num;
        if (!this.d.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.e.remove(str);
        HashMap hashMap = this.f;
        if (hashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + hashMap.get(str));
            hashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + bundle.getParcelable(str));
            bundle.remove(str);
        }
        HashMap hashMap2 = this.c;
        a2 a2Var = (a2) hashMap2.get(str);
        if (a2Var != null) {
            ArrayList arrayList = a2Var.b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                a2Var.a.b((w40) obj);
            }
            arrayList.clear();
            hashMap2.remove(str);
        }
    }
}
