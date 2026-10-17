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
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ArrowCircleLeftKt {
    private static ImageVector _arrowCircleLeft;

    public static final ImageVector getArrowCircleLeft(Icons.TwoTone twoTone) {
        ImageVector imageVector = _arrowCircleLeft;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ArrowCircleLeft", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(20.0f, 12.0f);
        b.curveToRelative(0.0f, 4.41f, -3.59f, 8.0f, -8.0f, 8.0f);
        b.reflectiveCurveToRelative(-8.0f, -3.59f, -8.0f, -8.0f);
        b.reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f);
        b.reflectiveCurveTo(20.0f, 7.59f, 20.0f, 12.0f);
        b.moveTo(12.0f, 13.0f);
        b.lineToRelative(4.0f, 0.0f);
        k4.z(b, -2.0f, -4.0f, 0.0f, 8.0f);
        b.lineToRelative(-4.0f, 4.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.j(b, 4.0f, 4.0f, 13.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(20.0f, 12.0f);
        b2.curveToRelative(0.0f, 4.41f, -3.59f, 8.0f, -8.0f, 8.0f);
        b2.reflectiveCurveToRelative(-8.0f, -3.59f, -8.0f, -8.0f);
        b2.reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f);
        b2.reflectiveCurveTo(20.0f, 7.59f, 20.0f, 12.0f);
        b2.moveTo(22.0f, 12.0f);
        b2.curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f);
        b2.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b2.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        b2.curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
        uo.l(b2, 22.0f, 12.0f, 12.0f, 13.0f);
        b2.lineToRelative(4.0f, 0.0f);
        k4.z(b2, -2.0f, -4.0f, 0.0f, 8.0f);
        b2.lineToRelative(-4.0f, 4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.j(b2, 4.0f, 4.0f, 13.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _arrowCircleLeft = build;
        build.getClass();
        return build;
    }
}
