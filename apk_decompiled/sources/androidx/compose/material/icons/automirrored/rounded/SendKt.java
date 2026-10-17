package androidx.compose.material.icons.automirrored.rounded;

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
public final class SendKt {
    private static ImageVector _send;

    public static final ImageVector getSend(Icons.AutoMirrored.Rounded rounded) {
        ImageVector imageVector = _send;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Rounded.Send", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(3.4f, 20.4f, 17.45f, -7.48f);
        e.curveToRelative(0.81f, -0.35f, 0.81f, -1.49f, 0.0f, -1.84f);
        e.lineTo(3.4f, 3.6f);
        e.curveToRelative(-0.66f, -0.29f, -1.39f, 0.2f, -1.39f, 0.91f);
        e.lineTo(2.0f, 9.12f);
        e.curveToRelative(0.0f, 0.5f, 0.37f, 0.93f, 0.87f, 0.99f);
        e.lineTo(17.0f, 12.0f);
        e.lineTo(2.87f, 13.88f);
        e.curveToRelative(-0.5f, 0.07f, -0.87f, 0.5f, -0.87f, 1.0f);
        e.lineToRelative(0.01f, 4.61f);
        e.curveToRelative(0.0f, 0.71f, 0.73f, 1.2f, 1.39f, 0.91f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _send = build;
        build.getClass();
        return build;
    }
}
