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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class KeyOffKt {
    private static ImageVector _keyOff;

    public static final ImageVector getKeyOff(Icons.Sharp sharp) {
        ImageVector imageVector = _keyOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.KeyOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(16.91f, 14.09f, 17.0f, 14.0f);
        i.lineToRelative(2.0f, 2.0f);
        i.lineToRelative(4.0f, -4.04f);
        i.lineTo(21.0f, 10.0f);
        gy.n(i, -8.17f, 16.91f, 14.09f);
        i.moveTo(3.98f, 6.81f);
        i.curveTo(2.2f, 7.85f, 1.0f, 9.79f, 1.0f, 12.0f);
        i.curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        i.curveToRelative(2.21f, 0.0f, 4.15f, -1.2f, 5.18f, -2.99f);
        i.lineToRelative(7.59f, 7.59f);
        i.lineToRelative(1.41f, -1.41f);
        i.lineTo(2.81f, 2.81f);
        r6.C(i, 1.39f, 4.22f, 3.98f, 6.81f);
        i.moveTo(9.91f, 12.74f);
        i.curveTo(9.58f, 14.03f, 8.4f, 15.0f, 7.0f, 15.0f);
        i.curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f);
        i.curveToRelative(0.0f, -1.4f, 0.97f, -2.58f, 2.26f, -2.91f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(i, 9.91f, 12.74f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _keyOff = build;
        build.getClass();
        return build;
    }
}
