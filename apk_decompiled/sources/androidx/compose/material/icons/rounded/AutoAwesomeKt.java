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
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AutoAwesomeKt {
    private static ImageVector _autoAwesome;

    public static final ImageVector getAutoAwesome(Icons.Rounded rounded) {
        ImageVector imageVector = _autoAwesome;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AutoAwesome", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(19.46f, 8.0f, 0.79f, -1.75f);
        e.lineTo(22.0f, 5.46f);
        e.curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0.0f, -0.91f);
        e.lineToRelative(-1.75f, -0.79f);
        e.lineTo(19.46f, 2.0f);
        e.curveToRelative(-0.18f, -0.39f, -0.73f, -0.39f, -0.91f, 0.0f);
        e.lineToRelative(-0.79f, 1.75f);
        e.lineTo(16.0f, 4.54f);
        e.curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0.0f, 0.91f);
        e.lineToRelative(1.75f, 0.79f);
        e.lineTo(18.54f, 8.0f);
        e.curveTo(18.72f, 8.39f, 19.28f, 8.39f, 19.46f, 8.0f);
        k4.r(e, 11.5f, 9.5f, 9.91f, 6.0f);
        e.curveTo(9.56f, 5.22f, 8.44f, 5.22f, 8.09f, 6.0f);
        e.lineTo(6.5f, 9.5f);
        e.lineTo(3.0f, 11.09f);
        e.curveToRelative(-0.78f, 0.36f, -0.78f, 1.47f, 0.0f, 1.82f);
        e.lineToRelative(3.5f, 1.59f);
        e.lineTo(8.09f, 18.0f);
        e.curveToRelative(0.36f, 0.78f, 1.47f, 0.78f, 1.82f, 0.0f);
        e.lineToRelative(1.59f, -3.5f);
        e.lineToRelative(3.5f, -1.59f);
        e.curveToRelative(0.78f, -0.36f, 0.78f, -1.47f, 0.0f, -1.82f);
        uo.l(e, 11.5f, 9.5f, 18.54f, 16.0f);
        e.lineToRelative(-0.79f, 1.75f);
        e.lineTo(16.0f, 18.54f);
        e.curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0.0f, 0.91f);
        e.lineToRelative(1.75f, 0.79f);
        e.lineTo(18.54f, 22.0f);
        e.curveToRelative(0.18f, 0.39f, 0.73f, 0.39f, 0.91f, 0.0f);
        e.lineToRelative(0.79f, -1.75f);
        e.lineTo(22.0f, 19.46f);
        e.curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0.0f, -0.91f);
        e.lineToRelative(-1.75f, -0.79f);
        e.lineTo(19.46f, 16.0f);
        e.curveTo(19.28f, 15.61f, 18.72f, 15.61f, 18.54f, 16.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _autoAwesome = build;
        build.getClass();
        return build;
    }
}
