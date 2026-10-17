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
import defpackage.af0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MaleKt {
    private static ImageVector _male;

    public static final ImageVector getMale(Icons.Rounded rounded) {
        ImageVector imageVector = _male;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Male", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(19.0f, 4.0f, -4.0f);
        a.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        a.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        a.horizontalLineToRelative(1.58f);
        a.lineToRelative(-3.97f, 3.97f);
        a.curveTo(11.73f, 9.36f, 10.66f, 9.0f, 9.5f, 9.0f);
        a.curveTo(6.46f, 9.0f, 4.0f, 11.46f, 4.0f, 14.5f);
        a.curveTo(4.0f, 17.54f, 6.46f, 20.0f, 9.5f, 20.0f);
        a.reflectiveCurveToRelative(5.5f, -2.46f, 5.5f, -5.5f);
        a.curveToRelative(0.0f, -1.16f, -0.36f, -2.23f, -0.97f, -3.12f);
        a.lineTo(18.0f, 7.42f);
        a.verticalLineTo(9.0f);
        a.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        a.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        a.verticalLineTo(5.0f);
        a.curveTo(20.0f, 4.45f, 19.55f, 4.0f, 19.0f, 4.0f);
        a.close();
        a.moveTo(9.5f, 18.0f);
        a.curveTo(7.57f, 18.0f, 6.0f, 16.43f, 6.0f, 14.5f);
        a.curveTo(6.0f, 12.57f, 7.57f, 11.0f, 9.5f, 11.0f);
        a.reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f);
        a.curveTo(13.0f, 16.43f, 11.43f, 18.0f, 9.5f, 18.0f);
        a.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, a.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _male = build;
        build.getClass();
        return build;
    }
}
