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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TakeoutDiningKt {
    private static ImageVector _takeoutDining;

    public static final ImageVector getTakeoutDining(Icons.Outlined outlined) {
        ImageVector imageVector = _takeoutDining;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.TakeoutDining", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = kf0.b(7.79f, 18.0f, -0.51f, -7.0f, 9.46f);
        gy.w(b, -0.51f, 7.0f, 7.79f);
        b.moveTo(9.83f, 5.0f);
        b.horizontalLineToRelative(4.33f);
        b.lineToRelative(2.8f, 2.73f);
        b.lineTo(16.87f, 9.0f);
        b.horizontalLineTo(7.12f);
        r6.C(b, 7.03f, 7.73f, 9.83f, 5.0f);
        b.moveTo(22.0f, 7.46f);
        b.lineToRelative(-1.41f, -1.41f);
        b.lineTo(19.0f, 7.63f);
        b.lineToRelative(0.03f, -0.56f);
        b.lineTo(14.98f, 3.0f);
        b.horizontalLineTo(9.02f);
        b.lineTo(4.97f, 7.07f);
        b.lineTo(5.0f, 7.57f);
        b.lineTo(3.41f, 6.01f);
        b.lineTo(2.0f, 7.44f);
        b.lineToRelative(3.23f, 3.11f);
        b.lineTo(5.93f, 20.0f);
        b.horizontalLineToRelative(12.14f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, 0.7f, -9.44f, 22.0f, 7.46f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _takeoutDining = build;
        build.getClass();
        return build;
    }
}
