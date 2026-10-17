package androidx.compose.ui.tooling.preview.datasource;

import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import defpackage.ao0;
import defpackage.br;
import defpackage.cc;
import defpackage.hi0;
import defpackage.j50;
import defpackage.kt0;
import defpackage.mb0;
import defpackage.ml;
import defpackage.o;
import defpackage.os;
import defpackage.p10;
import defpackage.wg;
import defpackage.wt;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class LoremIpsum implements PreviewParameterProvider<String> {
    public static final int $stable = 0;
    private final int words;

    public LoremIpsum(int i) {
        this.words = i;
    }

    private final String generateLoremIpsum(int i) {
        List list;
        hi0 hi0Var = new hi0();
        list = LoremIpsumKt.LOREM_IPSUM_SOURCE;
        wg wgVar = new wg(hi0Var, list.size(), 1);
        ao0 mlVar = new ml(new br(wgVar, new mb0(wgVar, 19), 2));
        if (i < 0) {
            o.c(j50.i(i, "Requested element count ", " is less than zero."));
            return null;
        }
        ao0 a = i == 0 ? wt.a : mlVar instanceof os ? ((os) mlVar).a(i) : new kt0(mlVar, i);
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i2 = 0;
        for (Object obj : a) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) " ");
            }
            p10.c(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String generateLoremIpsum$lambda$0(hi0 hi0Var, int i) {
        List list;
        list = LoremIpsumKt.LOREM_IPSUM_SOURCE;
        int i2 = hi0Var.d;
        hi0Var.d = i2 + 1;
        return (String) list.get(i2 % i);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public ao0 getValues() {
        return new cc(new String[]{generateLoremIpsum(this.words)}, 0);
    }

    public LoremIpsum() {
        this(500);
    }
}
