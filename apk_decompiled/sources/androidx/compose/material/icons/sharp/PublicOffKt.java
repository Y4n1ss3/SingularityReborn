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
import defpackage.gy;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PublicOffKt {
    private static ImageVector _publicOff;

    public static final ImageVector getPublicOff(Icons.Sharp sharp) {
        ImageVector imageVector = _publicOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PublicOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(11.0f, 8.17f, 6.49f, 3.66f);
        i.curveTo(8.07f, 2.61f, 9.96f, 2.0f, 12.0f, 2.0f);
        i.curveToRelative(5.52f, 0.0f, 10.0f, 4.48f, 10.0f, 10.0f);
        i.curveToRelative(0.0f, 2.04f, -0.61f, 3.93f, -1.66f, 5.51f);
        i.lineToRelative(-1.46f, -1.46f);
        i.curveTo(19.59f, 14.87f, 20.0f, 13.48f, 20.0f, 12.0f);
        i.curveToRelative(0.0f, -3.35f, -2.07f, -6.22f, -5.0f, -7.41f);
        i.verticalLineTo(5.0f);
        i.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        uo.r(i, -2.0f, 8.17f, 21.19f, 21.19f);
        i.lineToRelative(-1.41f, 1.41f);
        i.lineToRelative(-2.27f, -2.27f);
        i.curveTo(15.93f, 21.39f, 14.04f, 22.0f, 12.0f, 22.0f);
        i.curveTo(6.48f, 22.0f, 2.0f, 17.52f, 2.0f, 12.0f);
        i.curveToRelative(0.0f, -2.04f, 0.61f, -3.93f, 1.66f, -5.51f);
        i.lineTo(1.39f, 4.22f);
        gy.B(i, 1.41f, -1.41f, 21.19f, 21.19f);
        i.moveTo(11.0f, 18.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        i.verticalLineToRelative(-1.0f);
        i.lineToRelative(-4.79f, -4.79f);
        i.curveTo(4.08f, 10.79f, 4.0f, 11.38f, 4.0f, 12.0f);
        i.curveToRelative(0.0f, 4.08f, 3.05f, 7.44f, 7.0f, 7.93f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(i, 18.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _publicOff = build;
        build.getClass();
        return build;
    }
}
