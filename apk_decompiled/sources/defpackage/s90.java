package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class s90 extends us0 implements my {
    public final /* synthetic */ Context d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s90(Context context, String str, String str2, boolean z, long j, hm hmVar) {
        super(2, hmVar);
        this.d = context;
        this.e = str;
        this.f = str2;
        this.g = z;
        this.h = j;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new s90(this.d, this.e, this.f, this.g, this.h, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        return ((s90) create((un) obj, (hm) obj2)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        Object jj0Var;
        String str;
        p10.Q(obj);
        File filesDir = this.d.getFilesDir();
        StringBuilder sb = new StringBuilder("module_db_cache_");
        String str2 = this.e;
        sb.append(str2);
        sb.append("_");
        String str3 = this.f;
        sb.append(str3);
        sb.append(".json");
        File file = new File(filesDir, sb.toString());
        if (!this.g && file.exists() && System.currentTimeMillis() - file.lastModified() < this.h) {
            try {
                return new kj0(ts.s(new JSONObject(uv.L(file))));
            } catch (Exception e) {
                String message = e.getMessage();
                StringBuilder k = j50.k("fetchDb: cache read failed for ", str2, "/", str3, " (");
                k.append(message);
                k.append("), fetching fresh");
                Log.w("ModuleRepoManager", k.toString());
            }
        }
        try {
            JSONArray jSONArray = ts.k(this.e, this.f, null, false, false, 60).getJSONArray("assets");
            int length = jSONArray.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    str = null;
                    break;
                }
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string = jSONObject.getString("name");
                string.getClass();
                if (ks0.Z(string, ".json", true)) {
                    str = jSONObject.getString("browser_download_url");
                    break;
                }
                i++;
            }
        } catch (Exception e2) {
            String message2 = e2.getMessage();
            StringBuilder k2 = j50.k("fetchDb failed for ", str2, "/", str3, ": ");
            k2.append(message2);
            Log.e("ModuleRepoManager", k2.toString());
            if (file.exists()) {
                try {
                    Log.w("ModuleRepoManager", "fetchDb: falling back to stale cache for " + str2 + "/" + str3 + " after fetch failure");
                    return new kj0(ts.s(new JSONObject(uv.L(file))));
                } catch (Exception unused) {
                    jj0Var = new jj0(e2);
                    return new kj0(jj0Var);
                }
            }
            jj0Var = new jj0(e2);
        }
        if (str == null) {
            return new kj0(new jj0(new Exception("No .json catalog asset found in " + str2 + "/" + str3 + "'s latest release.")));
        }
        String n = ts.n(str);
        jj0Var = ts.s(new JSONObject(n));
        try {
            uv.M(file, n);
        } catch (Exception e3) {
            Log.w("ModuleRepoManager", "fetchDb: failed to write cache for " + str2 + "/" + str3 + ": " + e3.getMessage());
        }
        return new kj0(jj0Var);
    }
}
