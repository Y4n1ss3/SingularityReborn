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
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MovingKt {
    private static ImageVector _moving;

    public static final ImageVector getMoving(Icons.TwoTone twoTone) {
        ImageVector imageVector = _moving;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Moving", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder u = kp0.u(19.71f, 9.71f, 22.0f, 12.0f, 6.0f);
        u.horizontalLineToRelative(-6.0f);
        u.lineToRelative(2.29f, 2.29f);
        u.lineToRelative(-4.17f, 4.17f);
        u.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        u.lineToRelative(-1.17f, -1.17f);
        u.curveToRelative(-1.17f, -1.17f, -3.07f, -1.17f, -4.24f, 0.0f);
        u.lineTo(2.0f, 16.59f);
        u.lineTo(3.41f, 18.0f);
        u.lineToRelative(5.29f, -5.29f);
        u.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        u.lineToRelative(1.17f, 1.17f);
        u.curveToRelative(1.17f, 1.17f, 3.07f, 1.17f, 4.24f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(u, 19.71f, 9.71f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _moving = build;
        build.getClass();
        return build;
    }
}
