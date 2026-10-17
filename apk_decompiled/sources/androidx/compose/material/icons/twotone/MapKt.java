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
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MapKt {
    private static ImageVector _map;

    public static final ImageVector getMap(Icons.TwoTone twoTone) {
        ImageVector imageVector = _map;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Map", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(5.0f, 18.31f, 3.0f, -1.16f);
        r6.C(e, 8.0f, 5.45f, 5.0f, 6.46f);
        e.moveTo(16.0f, 18.55f);
        e.lineToRelative(3.0f, -1.01f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.u(e, 19.0f, 5.69f, -3.0f, 1.17f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e2 = k4.e(20.5f, 3.0f, -0.16f, 0.03f);
        e2.lineTo(15.0f, 5.1f);
        e2.lineTo(9.0f, 3.0f);
        e2.lineTo(3.36f, 4.9f);
        e2.curveToRelative(-0.21f, 0.07f, -0.36f, 0.25f, -0.36f, 0.48f);
        e2.lineTo(3.0f, 20.5f);
        e2.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        e2.lineToRelative(0.16f, -0.03f);
        e2.lineTo(9.0f, 18.9f);
        e2.lineToRelative(6.0f, 2.1f);
        e2.lineToRelative(5.64f, -1.9f);
        e2.curveToRelative(0.21f, -0.07f, 0.36f, -0.25f, 0.36f, -0.48f);
        e2.lineTo(21.0f, 3.5f);
        e2.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        k4.x(e2, 8.0f, 17.15f, -3.0f, 1.16f);
        e2.lineTo(5.0f, 6.46f);
        uf.v(e2, 3.0f, -1.01f, 11.7f);
        e2.moveTo(14.0f, 18.53f);
        e2.lineToRelative(-4.0f, -1.4f);
        e2.lineTo(10.0f, 5.47f);
        uf.v(e2, 4.0f, 1.4f, 11.66f);
        e2.moveTo(19.0f, 17.54f);
        e2.lineToRelative(-3.0f, 1.01f);
        e2.lineTo(16.0f, 6.86f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.n(e2, 3.0f, -1.16f, 11.84f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _map = build;
        build.getClass();
        return build;
    }
}
