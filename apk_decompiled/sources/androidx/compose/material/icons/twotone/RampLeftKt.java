package androidx.compose.material.icons.twotone;

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
import defpackage.j50;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RampLeftKt {
    private static ImageVector _rampLeft;

    public static final ImageVector getRampLeft(Icons.TwoTone twoTone) {
        ImageVector imageVector = _rampLeft;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.RampLeft", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = j50.e(13.0f, 21.0f, -2.0f, 6.83f);
        e.lineTo(9.41f, 8.41f);
        e.lineTo(8.0f, 7.0f);
        e.lineToRelative(4.0f, -4.0f);
        e.lineToRelative(4.0f, 4.0f);
        e.lineToRelative(-1.41f, 1.41f);
        e.lineTo(13.0f, 6.83f);
        e.verticalLineTo(9.0f);
        e.curveToRelative(0.0f, 4.27f, 4.03f, 7.13f, 6.0f, 8.27f);
        e.lineToRelative(-1.46f, 1.46f);
        e.curveToRelative(-1.91f, -1.16f, -3.44f, -2.53f, -4.54f, -4.02f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(e, 13.0f, 21.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rampLeft = build;
        build.getClass();
        return build;
    }
}
