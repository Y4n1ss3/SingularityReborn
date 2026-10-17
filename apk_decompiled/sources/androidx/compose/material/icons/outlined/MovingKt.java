package androidx.compose.material.icons.outlined;

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
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MovingKt {
    private static ImageVector _moving;

    public static final ImageVector getMoving(Icons.Outlined outlined) {
        ImageVector imageVector = _moving;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Moving", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder c = uf.c(20.0f, 9.42f, 12.0f, 2.0f, 6.0f);
        kf0.x(c, -6.0f, 2.0f, 2.58f);
        c.lineToRelative(-4.46f, 4.46f);
        c.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        c.lineToRelative(-1.17f, -1.17f);
        c.curveToRelative(-1.17f, -1.17f, -3.07f, -1.17f, -4.24f, 0.0f);
        c.lineTo(2.0f, 16.59f);
        c.lineTo(3.41f, 18.0f);
        c.lineToRelative(5.29f, -5.29f);
        c.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        c.lineToRelative(1.17f, 1.17f);
        c.curveToRelative(1.17f, 1.17f, 3.07f, 1.17f, 4.24f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(c, 20.0f, 9.42f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _moving = build;
        build.getClass();
        return build;
    }
}
