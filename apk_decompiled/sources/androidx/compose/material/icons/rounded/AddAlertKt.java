package androidx.compose.material.icons.rounded;

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
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AddAlertKt {
    private static ImageVector _addAlert;

    public static final ImageVector getAddAlert(Icons.Rounded rounded) {
        ImageVector imageVector = _addAlert;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AddAlert", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 22.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.horizontalLineToRelative(-4.0f);
        b.curveTo(10.0f, 21.1f, 10.9f, 22.0f, 12.0f, 22.0f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = bv.b(19.0f, 17.0f, -1.0f, -7.0f);
        b2.curveToRelative(0.0f, -2.79f, -1.91f, -5.14f, -4.5f, -5.8f);
        b2.verticalLineTo(3.5f);
        b2.curveTo(13.5f, 2.67f, 12.83f, 2.0f, 12.0f, 2.0f);
        b2.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        b2.verticalLineToRelative(0.7f);
        b2.curveTo(7.91f, 4.86f, 6.0f, 7.21f, 6.0f, 10.0f);
        b2.verticalLineToRelative(7.0f);
        b2.horizontalLineTo(5.0f);
        b2.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b2.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        b2.horizontalLineToRelative(14.0f);
        b2.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b2.reflectiveCurveTo(19.55f, 17.0f, 19.0f, 17.0f);
        r6.B(b2, 14.0f, 13.0f, -1.0f, 1.0f);
        b2.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        b2.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        b2.verticalLineToRelative(-1.0f);
        b2.horizontalLineToRelative(-1.0f);
        b2.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b2.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        b2.horizontalLineToRelative(1.0f);
        b2.verticalLineToRelative(-1.0f);
        b2.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b2.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        b2.verticalLineToRelative(1.0f);
        b2.horizontalLineToRelative(1.0f);
        b2.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b2, 14.55f, 13.0f, 14.0f, 13.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addAlert = build;
        build.getClass();
        return build;
    }
}
