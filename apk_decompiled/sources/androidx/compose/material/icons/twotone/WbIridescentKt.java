package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.bv;
import defpackage.fc;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WbIridescentKt {
    private static ImageVector _wbIridescent;

    public static final ImageVector getWbIridescent(Icons.TwoTone twoTone) {
        ImageVector imageVector = _wbIridescent;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.WbIridescent", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.f(7.0f, 11.0f, 10.0f, 2.0f, 7.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(5.0f, 15.0f, 14.0f, 19.0f, 9.0f);
        bv.r(p, 5.0f, 9.0f, 6.0f);
        k4.C(p, 7.0f, 11.0f, 10.0f, 2.0f);
        bv.r(p, 7.0f, 13.0f, -2.0f);
        k4.C(p, 11.0f, 1.0f, 2.0f, 3.0f);
        j50.t(p, -2.0f, 17.25f, 5.39f);
        p.lineToRelative(1.41f, 1.41f);
        fc.C(p, 1.8f, -1.79f, -1.42f, -1.41f);
        k4.C(p, 11.0f, 20.0f, 2.0f, 3.0f);
        j50.t(p, -2.0f, 17.24f, 18.71f);
        p.lineToRelative(1.79f, 1.8f);
        fc.C(p, 1.42f, -1.42f, -1.8f, -1.79f);
        p.moveTo(5.34f, 6.805f);
        p.lineToRelative(-1.788f, -1.79f);
        bv.o(p, 4.96f, 3.61f, 1.788f, 1.788f);
        p.moveTo(3.55f, 19.08f);
        p.lineToRelative(1.41f, 1.42f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(p, 1.79f, -1.8f, -1.41f, -1.41f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wbIridescent = build;
        build.getClass();
        return build;
    }
}
