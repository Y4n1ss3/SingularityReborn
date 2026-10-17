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
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FastRewindKt {
    private static ImageVector _fastRewind;

    public static final ImageVector getFastRewind(Icons.Rounded rounded) {
        ImageVector imageVector = _fastRewind;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FastRewind", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(11.0f, 16.07f, 11.0f, 7.93f);
        i.curveToRelative(0.0f, -0.81f, -0.91f, -1.28f, -1.58f, -0.82f);
        i.lineToRelative(-5.77f, 4.07f);
        i.curveToRelative(-0.56f, 0.4f, -0.56f, 1.24f, 0.0f, 1.63f);
        i.lineToRelative(5.77f, 4.07f);
        i.curveToRelative(0.67f, 0.47f, 1.58f, 0.0f, 1.58f, -0.81f);
        k4.x(i, 12.66f, 12.82f, 5.77f, 4.07f);
        i.curveToRelative(0.66f, 0.47f, 1.58f, -0.01f, 1.58f, -0.82f);
        i.lineTo(20.01f, 7.93f);
        i.curveToRelative(0.0f, -0.81f, -0.91f, -1.28f, -1.58f, -0.82f);
        i.lineToRelative(-5.77f, 4.07f);
        i.curveToRelative(-0.57f, 0.4f, -0.57f, 1.24f, 0.0f, 1.64f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fastRewind = build;
        build.getClass();
        return build;
    }
}
