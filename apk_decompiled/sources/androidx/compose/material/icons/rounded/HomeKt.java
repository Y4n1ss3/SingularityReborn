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
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HomeKt {
    private static ImageVector _home;

    public static final ImageVector getHome(Icons.Rounded rounded) {
        ImageVector imageVector = _home;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Home", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = kp0.s(10.0f, 19.0f, -5.0f, 4.0f, 5.0f);
        s.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        s.horizontalLineToRelative(3.0f);
        s.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        s.verticalLineToRelative(-7.0f);
        s.horizontalLineToRelative(1.7f);
        s.curveToRelative(0.46f, 0.0f, 0.68f, -0.57f, 0.33f, -0.87f);
        s.lineTo(12.67f, 3.6f);
        s.curveToRelative(-0.38f, -0.34f, -0.96f, -0.34f, -1.34f, 0.0f);
        s.lineToRelative(-8.36f, 7.53f);
        s.curveToRelative(-0.34f, 0.3f, -0.13f, 0.87f, 0.33f, 0.87f);
        s.horizontalLineTo(5.0f);
        s.verticalLineToRelative(7.0f);
        s.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        s.horizontalLineToRelative(3.0f);
        s.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        s.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, s.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _home = build;
        build.getClass();
        return build;
    }
}
