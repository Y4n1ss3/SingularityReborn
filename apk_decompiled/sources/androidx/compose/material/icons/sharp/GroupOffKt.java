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
import defpackage.gy;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GroupOffKt {
    private static ImageVector _groupOff;

    public static final ImageVector getGroupOff(Icons.Sharp sharp) {
        ImageVector imageVector = _groupOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.GroupOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(15.0f, 8.0f);
        b.curveToRelative(0.0f, -1.42f, -0.5f, -2.73f, -1.33f, -3.76f);
        b.curveTo(14.09f, 4.1f, 14.53f, 4.0f, 15.0f, 4.0f);
        b.curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f);
        b.reflectiveCurveToRelative(-1.79f, 4.0f, -4.0f, 4.0f);
        b.curveToRelative(-0.06f, 0.0f, -0.12f, 0.0f, -0.18f, 0.0f);
        b.lineToRelative(-0.77f, -0.77f);
        b.curveTo(14.65f, 10.29f, 15.0f, 9.18f, 15.0f, 8.0f);
        uo.q(b, 22.83f, 20.0f, 23.0f, -3.0f);
        b.curveToRelative(0.0f, -2.18f, -3.58f, -3.47f, -6.34f, -3.87f);
        b.curveToRelative(1.1f, 0.75f, 1.95f, 1.71f, 2.23f, 2.94f);
        uo.l(b, 22.83f, 20.0f, 7.24f, 4.41f);
        b.curveTo(7.77f, 4.15f, 8.37f, 4.0f, 9.0f, 4.0f);
        b.curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f);
        b.curveToRelative(0.0f, 0.63f, -0.15f, 1.23f, -0.41f, 1.76f);
        uo.l(b, 7.24f, 4.41f, 9.17f, 12.0f);
        b.curveTo(9.11f, 12.0f, 9.06f, 12.0f, 9.0f, 12.0f);
        b.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        b.curveToRelative(0.0f, -0.06f, 0.0f, -0.11f, 0.0f, -0.17f);
        b.lineTo(0.69f, 3.51f);
        b.lineTo(2.1f, 2.1f);
        b.lineToRelative(19.8f, 19.8f);
        b.lineToRelative(-1.41f, 1.41f);
        uf.u(b, 17.0f, 19.83f, 20.0f, 1.0f);
        b.verticalLineToRelative(-3.0f);
        b.curveToRelative(0.0f, -2.66f, 5.33f, -4.0f, 8.0f, -4.0f);
        b.curveToRelative(0.37f, 0.0f, 0.8f, 0.03f, 1.25f, 0.08f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 9.17f, 12.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _groupOff = build;
        build.getClass();
        return build;
    }
}
