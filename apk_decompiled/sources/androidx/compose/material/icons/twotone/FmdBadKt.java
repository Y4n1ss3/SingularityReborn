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
import defpackage.c21;
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FmdBadKt {
    private static ImageVector _fmdBad;

    public static final ImageVector getFmdBad(Icons.TwoTone twoTone) {
        ImageVector imageVector = _fmdBad;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.FmdBad", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(11.0f, 15.0f, 2.0f, -2.0f, -2.0f);
        k4.D(n, 15.0f, 11.0f, 11.0f, 2.0f);
        c21.c(n, 6.0f, -2.0f, 11.0f);
        n.moveTo(12.0f, 2.0f);
        n.curveToRelative(-4.2f, 0.0f, -8.0f, 3.22f, -8.0f, 8.2f);
        n.curveToRelative(0.0f, 3.32f, 2.67f, 7.25f, 8.0f, 11.8f);
        n.curveToRelative(5.33f, -4.55f, 8.0f, -8.48f, 8.0f, -11.8f);
        n.curveTo(20.0f, 5.22f, 16.2f, 2.0f, 12.0f, 2.0f);
        n.close();
        n.moveTo(12.0f, 19.33f);
        n.curveToRelative(-4.05f, -3.7f, -6.0f, -6.79f, -6.0f, -9.14f);
        n.curveTo(6.0f, 6.57f, 8.65f, 4.0f, 12.0f, 4.0f);
        n.reflectiveCurveToRelative(6.0f, 2.57f, 6.0f, 6.2f);
        n.curveTo(18.0f, 12.54f, 16.05f, 15.64f, 12.0f, 19.33f);
        n.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, n.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 19.33f);
        b.curveToRelative(4.05f, -3.7f, 6.0f, -6.79f, 6.0f, -9.14f);
        b.curveTo(18.0f, 6.57f, 15.35f, 4.0f, 12.0f, 4.0f);
        b.reflectiveCurveToRelative(-6.0f, 2.57f, -6.0f, 6.2f);
        b.curveTo(6.0f, 12.54f, 7.95f, 15.64f, 12.0f, 19.33f);
        r6.B(b, 11.0f, 6.0f, 2.0f, 5.0f);
        uo.r(b, -2.0f, 6.0f, 11.0f, 13.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.m(b, 2.0f, 2.0f, -2.0f, 13.0f), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fmdBad = build;
        build.getClass();
        return build;
    }
}
