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
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PersonPinCircleKt {
    private static ImageVector _personPinCircle;

    public static final ImageVector getPersonPinCircle(Icons.TwoTone twoTone) {
        ImageVector imageVector = _personPinCircle;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PersonPinCircle", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.5f, 10.2f);
        b.curveToRelative(0.0f, 2.57f, -2.1f, 5.79f, -6.16f, 9.51f);
        b.lineTo(12.0f, 20.01f);
        b.lineToRelative(-0.34f, -0.31f);
        b.curveTo(7.6f, 15.99f, 5.5f, 12.77f, 5.5f, 10.2f);
        b.curveToRelative(0.0f, -3.84f, 2.82f, -6.7f, 6.5f, -6.7f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 18.5f, 6.35f, 18.5f, 10.2f), defaultFillType, "", solidColor, 0.3f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(12.0f, 11.0f);
        b2.curveToRelative(1.33f, 0.0f, 4.0f, 0.67f, 4.0f, 2.0f);
        b2.verticalLineToRelative(0.16f);
        b2.curveTo(15.03f, 14.28f, 13.6f, 15.0f, 12.0f, 15.0f);
        b2.reflectiveCurveToRelative(-3.03f, -0.72f, -4.0f, -1.84f);
        b2.verticalLineTo(13.0f);
        b2.curveTo(8.0f, 11.67f, 10.67f, 11.0f, 12.0f, 11.0f);
        b2.close();
        b2.moveTo(12.0f, 10.0f);
        b2.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        b2.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        b2.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        b2.reflectiveCurveTo(13.1f, 10.0f, 12.0f, 10.0f);
        b2.close();
        b2.moveTo(18.0f, 10.2f);
        b2.curveTo(18.0f, 6.57f, 15.35f, 4.0f, 12.0f, 4.0f);
        b2.reflectiveCurveToRelative(-6.0f, 2.57f, -6.0f, 6.2f);
        b2.curveToRelative(0.0f, 2.34f, 1.95f, 5.44f, 6.0f, 9.14f);
        b2.curveTo(16.05f, 15.64f, 18.0f, 12.54f, 18.0f, 10.2f);
        b2.close();
        b2.moveTo(12.0f, 2.0f);
        b2.curveToRelative(4.2f, 0.0f, 8.0f, 3.22f, 8.0f, 8.2f);
        b2.curveToRelative(0.0f, 3.32f, -2.67f, 7.25f, -8.0f, 11.8f);
        b2.curveToRelative(-5.33f, -4.55f, -8.0f, -8.48f, -8.0f, -11.8f);
        b2.curveTo(4.0f, 5.22f, 7.8f, 2.0f, 12.0f, 2.0f);
        b2.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _personPinCircle = build;
        build.getClass();
        return build;
    }
}
