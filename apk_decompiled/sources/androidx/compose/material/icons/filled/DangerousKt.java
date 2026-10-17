package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.af0;
import defpackage.bv;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DangerousKt {
    private static ImageVector _dangerous;

    public static final ImageVector getDangerous(Icons.Filled filled) {
        ImageVector imageVector = _dangerous;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Dangerous", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder l = uf.l(15.73f, 3.0f, 8.27f, 3.0f, 8.27f);
        uo.k(l, 7.46f, 8.27f, 21.0f, 7.46f);
        l.lineTo(21.0f, 15.73f);
        bv.k(l, 8.27f, 15.73f, 3.0f);
        l.moveTo(17.0f, 15.74f);
        l.lineTo(15.74f, 17.0f);
        l.lineTo(12.0f, 13.26f);
        l.lineTo(8.26f, 17.0f);
        l.lineTo(7.0f, 15.74f);
        l.lineTo(10.74f, 12.0f);
        l.lineTo(7.0f, 8.26f);
        l.lineTo(8.26f, 7.0f);
        l.lineTo(12.0f, 10.74f);
        l.lineTo(15.74f, 7.0f);
        l.lineTo(17.0f, 8.26f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(l, 13.26f, 12.0f, 17.0f, 15.74f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dangerous = build;
        build.getClass();
        return build;
    }
}
