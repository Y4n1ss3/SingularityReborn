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
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LocalLaundryServiceKt {
    private static ImageVector _localLaundryService;

    public static final ImageVector getLocalLaundryService(Icons.Rounded rounded) {
        ImageVector imageVector = _localLaundryService;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LocalLaundryService", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(9.64f, 16.36f);
        b.curveToRelative(1.3f, 1.3f, 3.42f, 1.3f, 4.72f, 0.0f);
        b.curveToRelative(1.3f, -1.3f, 1.3f, -3.42f, 0.0f, -4.72f);
        uo.l(b, 9.64f, 16.36f, 18.0f, 2.01f);
        b.lineTo(6.0f, 2.0f);
        b.curveTo(4.89f, 2.0f, 4.0f, 2.89f, 4.0f, 4.0f);
        b.verticalLineToRelative(16.0f);
        b.curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(12.0f);
        b.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        b.verticalLineTo(4.0f);
        b.curveTo(20.0f, 2.89f, 19.11f, 2.01f, 18.0f, 2.01f);
        b.close();
        b.moveTo(11.0f, 5.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        b.reflectiveCurveTo(10.45f, 5.0f, 11.0f, 5.0f);
        b.close();
        b.moveTo(8.0f, 5.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        b.reflectiveCurveTo(8.55f, 7.0f, 8.0f, 7.0f);
        b.reflectiveCurveTo(7.0f, 6.55f, 7.0f, 6.0f);
        b.reflectiveCurveTo(7.45f, 5.0f, 8.0f, 5.0f);
        b.close();
        b.moveTo(12.0f, 19.0f);
        b.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        b.curveToRelative(0.0f, -2.76f, 2.24f, -5.0f, 5.0f, -5.0f);
        b.reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f);
        b.curveTo(17.0f, 16.76f, 14.76f, 19.0f, 12.0f, 19.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localLaundryService = build;
        build.getClass();
        return build;
    }
}
