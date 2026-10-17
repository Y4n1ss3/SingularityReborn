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
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TransformKt {
    private static ImageVector _transform;

    public static final ImageVector getTransform(Icons.Sharp sharp) {
        ImageVector imageVector = _transform;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Transform", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder y = kp0.y(22.0f, 18.0f, -2.0f, 8.0f, 4.0f);
        y.horizontalLineToRelative(2.0f);
        y.lineTo(7.0f, 1.0f);
        fc.w(y, 4.0f, 4.0f, 2.0f, 2.0f);
        uf.k(y, 2.0f, 2.0f, 4.0f, 10.0f);
        kf0.x(y, 10.0f, 2.0f, -2.0f);
        y.lineToRelative(3.0f, 3.0f);
        r6.q(y, 3.0f, -3.0f, -2.0f, -2.0f);
        kp0.A(y, 4.0f, 10.0f, 8.0f, 6.0f);
        k4.l(y, 6.0f, 2.0f, 6.0f, -8.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(y, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _transform = build;
        build.getClass();
        return build;
    }
}
