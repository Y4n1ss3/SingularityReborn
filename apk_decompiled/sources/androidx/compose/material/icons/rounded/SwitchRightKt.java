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
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SwitchRightKt {
    private static ImageVector _switchRight;

    public static final ImageVector getSwitchRight(Icons.Rounded rounded) {
        ImageVector imageVector = _switchRight;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SwitchRight", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder j = af0.j(15.5f, 15.38f, 8.62f, 18.88f, 12.0f);
        j.lineTo(15.5f, 15.38f);
        j.moveTo(20.29f, 12.71f);
        j.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        j.lineToRelative(-4.59f, -4.59f);
        j.curveTo(15.08f, 6.08f, 14.0f, 6.52f, 14.0f, 7.41f);
        j.verticalLineToRelative(9.17f);
        j.curveToRelative(0.0f, 0.89f, 1.08f, 1.34f, 1.71f, 0.71f);
        uo.l(j, 20.29f, 12.71f, 10.0f, 16.59f);
        j.verticalLineTo(7.41f);
        j.curveToRelative(0.0f, -0.89f, -1.08f, -1.34f, -1.71f, -0.71f);
        j.lineToRelative(-4.59f, 4.59f);
        j.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        j.lineToRelative(4.59f, 4.59f);
        j.curveTo(8.92f, 17.92f, 10.0f, 17.48f, 10.0f, 16.59f);
        j.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _switchRight = build;
        build.getClass();
        return build;
    }
}
