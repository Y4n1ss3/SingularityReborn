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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CallEndKt {
    private static ImageVector _callEnd;

    public static final ImageVector getCallEnd(Icons.Rounded rounded) {
        ImageVector imageVector = _callEnd;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.CallEnd", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(4.51f, 15.48f, 2.0f, -1.59f);
        e.curveToRelative(0.48f, -0.38f, 0.76f, -0.96f, 0.76f, -1.57f);
        e.verticalLineToRelative(-2.6f);
        e.curveToRelative(3.02f, -0.98f, 6.29f, -0.99f, 9.32f, 0.0f);
        e.verticalLineToRelative(2.61f);
        e.curveToRelative(0.0f, 0.61f, 0.28f, 1.19f, 0.76f, 1.57f);
        e.lineToRelative(1.99f, 1.58f);
        e.curveToRelative(0.8f, 0.63f, 1.94f, 0.57f, 2.66f, -0.15f);
        e.lineToRelative(1.22f, -1.22f);
        e.curveToRelative(0.8f, -0.8f, 0.8f, -2.13f, -0.05f, -2.88f);
        e.curveToRelative(-6.41f, -5.66f, -16.07f, -5.66f, -22.48f, 0.0f);
        e.curveToRelative(-0.85f, 0.75f, -0.85f, 2.08f, -0.05f, 2.88f);
        e.lineToRelative(1.22f, 1.22f);
        e.curveToRelative(0.71f, 0.72f, 1.85f, 0.78f, 2.65f, 0.15f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _callEnd = build;
        build.getClass();
        return build;
    }
}
