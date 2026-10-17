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
import defpackage.gy;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ForkRightKt {
    private static ImageVector _forkRight;

    public static final ImageVector getForkRight(Icons.Sharp sharp) {
        ImageVector imageVector = _forkRight;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ForkRight", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(14.59f, 15.59f, 16.0f, 17.0f);
        i.lineToRelative(4.0f, -4.0f);
        i.lineToRelative(-4.0f, -4.0f);
        i.lineToRelative(-1.41f, 1.41f);
        i.lineTo(16.17f, 12.0f);
        i.curveToRelative(-1.51f, -0.33f, -3.73f, 0.08f, -5.17f, 1.36f);
        i.lineToRelative(0.0f, -6.53f);
        i.lineToRelative(1.59f, 1.59f);
        i.lineTo(14.0f, 7.0f);
        i.lineToRelative(-4.0f, -4.0f);
        i.lineTo(6.0f, 7.0f);
        i.lineToRelative(1.41f, 1.41f);
        i.lineTo(9.0f, 6.83f);
        k4.y(i, 21.0f, 2.0f, 0.0f, -4.0f);
        i.curveToRelative(0.73f, -2.58f, 3.07f, -3.47f, 5.17f, -3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(i, 14.59f, 15.59f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _forkRight = build;
        build.getClass();
        return build;
    }
}
