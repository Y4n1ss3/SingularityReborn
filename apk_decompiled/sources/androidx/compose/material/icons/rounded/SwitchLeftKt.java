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
import defpackage.gy;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SwitchLeftKt {
    private static ImageVector _switchLeft;

    public static final ImageVector getSwitchLeft(Icons.Rounded rounded) {
        ImageVector imageVector = _switchLeft;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SwitchLeft", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder y = gy.y(8.5f, 8.62f, 6.76f, 5.12f, 12.0f);
        y.lineTo(8.5f, 8.62f);
        y.moveTo(3.71f, 11.29f);
        y.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        y.lineToRelative(4.59f, 4.59f);
        y.curveTo(8.92f, 17.92f, 10.0f, 17.48f, 10.0f, 16.59f);
        y.verticalLineTo(7.41f);
        y.curveToRelative(0.0f, -0.89f, -1.08f, -1.34f, -1.71f, -0.71f);
        uo.l(y, 3.71f, 11.29f, 14.0f, 7.41f);
        y.verticalLineToRelative(9.17f);
        y.curveToRelative(0.0f, 0.89f, 1.08f, 1.34f, 1.71f, 0.71f);
        y.lineToRelative(4.59f, -4.59f);
        y.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        y.lineToRelative(-4.59f, -4.59f);
        y.curveTo(15.08f, 6.08f, 14.0f, 6.52f, 14.0f, 7.41f);
        y.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, y.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _switchLeft = build;
        build.getClass();
        return build;
    }
}
