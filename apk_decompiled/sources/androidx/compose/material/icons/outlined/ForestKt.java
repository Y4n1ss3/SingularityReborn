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
import defpackage.fc;
import defpackage.gy;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ForestKt {
    private static ImageVector _forest;

    public static final ImageVector getForest(Icons.Outlined outlined) {
        ImageVector imageVector = _forest;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Forest", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder u = gy.u(24.0f, 18.0f, -3.86f, -6.0f, 22.0f);
        u.lineTo(15.0f, 2.0f);
        u.lineToRelative(-3.0f, 4.29f);
        u.lineTo(9.0f, 2.0f);
        u.lineTo(2.0f, 12.0f);
        uo.n(u, 1.86f, 0.0f, 18.0f, 7.0f);
        r6.D(u, 4.0f, 4.0f, -4.0f, 2.0f);
        fc.y(u, 4.0f, 4.0f, -4.0f, 24.0f);
        u.moveTo(15.0f, 5.49f);
        u.lineTo(18.16f, 10.0f);
        kf0.B(u, -1.68f, 3.86f, 6.0f, -3.62f);
        u.lineToRelative(-2.57f, -4.0f);
        u.horizontalLineTo(16.0f);
        gy.B(u, -2.78f, -3.97f, 15.0f, 5.49f);
        u.moveTo(3.66f, 16.0f);
        u.lineToRelative(3.86f, -6.0f);
        u.horizontalLineTo(5.84f);
        u.lineTo(9.0f, 5.49f);
        u.lineTo(12.16f, 10.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.e(u, -1.68f, 3.86f, 6.0f, 3.66f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _forest = build;
        build.getClass();
        return build;
    }
}
