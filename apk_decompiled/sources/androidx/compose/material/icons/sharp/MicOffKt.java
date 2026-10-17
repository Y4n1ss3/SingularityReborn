package androidx.compose.material.icons.sharp;

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
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MicOffKt {
    private static ImageVector _micOff;

    public static final ImageVector getMicOff(Icons.Sharp sharp) {
        ImageVector imageVector = _micOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.MicOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(15.0f, 10.6f, 15.0f, 5.0f);
        i.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        i.curveToRelative(-1.54f, 0.0f, -2.79f, 1.16f, -2.96f, 2.65f);
        uo.l(i, 15.0f, 10.6f, 19.0f, 11.0f);
        i.horizontalLineToRelative(-1.7f);
        i.curveToRelative(0.0f, 0.58f, -0.1f, 1.13f, -0.27f, 1.64f);
        i.lineToRelative(1.27f, 1.27f);
        i.curveToRelative(0.44f, -0.88f, 0.7f, -1.87f, 0.7f, -2.91f);
        k4.r(i, 4.41f, 2.86f, 3.0f, 4.27f);
        i.lineToRelative(6.0f, 6.0f);
        i.lineTo(9.0f, 11.0f);
        i.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        i.curveToRelative(0.23f, 0.0f, 0.44f, -0.03f, 0.65f, -0.08f);
        i.lineToRelative(1.66f, 1.66f);
        i.curveToRelative(-0.71f, 0.33f, -1.5f, 0.52f, -2.31f, 0.52f);
        i.curveToRelative(-2.76f, 0.0f, -5.3f, -2.1f, -5.3f, -5.1f);
        i.lineTo(5.0f, 11.0f);
        i.curveToRelative(0.0f, 3.41f, 2.72f, 6.23f, 6.0f, 6.72f);
        fc.w(i, 11.0f, 21.0f, 2.0f, -3.28f);
        i.curveToRelative(0.91f, -0.13f, 1.77f, -0.45f, 2.55f, -0.9f);
        i.lineToRelative(4.2f, 4.2f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(i, 1.41f, -1.41f, 4.41f, 2.86f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _micOff = build;
        build.getClass();
        return build;
    }
}
