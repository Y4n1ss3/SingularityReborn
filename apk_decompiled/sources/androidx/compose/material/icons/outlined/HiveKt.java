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
public final class HiveKt {
    private static ImageVector _hive;

    public static final ImageVector getHive(Icons.Outlined outlined) {
        ImageVector imageVector = _hive;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Hive", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = kf0.b(21.5f, 9.0f, -2.25f, -4.0f, -3.31f);
        b.lineToRelative(-1.69f, -3.0f);
        kf0.A(b, -4.5f, 8.06f, 5.0f, 4.75f);
        b.lineTo(2.5f, 9.0f);
        b.lineToRelative(1.69f, 3.0f);
        b.lineTo(2.5f, 15.0f);
        b.lineToRelative(2.25f, 4.0f);
        kf0.B(b, 3.31f, 1.69f, 3.0f, 4.5f);
        b.lineToRelative(1.69f, -3.0f);
        b.horizontalLineToRelative(3.31f);
        b.lineToRelative(2.25f, -4.0f);
        gy.B(b, -1.69f, -3.0f, 21.5f, 9.0f);
        b.moveTo(19.21f, 9.0f);
        b.lineToRelative(-1.12f, 2.0f);
        b.horizontalLineToRelative(-2.14f);
        b.lineToRelative(-1.12f, -2.0f);
        b.lineToRelative(1.12f, -2.0f);
        gy.n(b, 2.14f, 19.21f, 9.0f);
        b.moveTo(10.94f, 14.0f);
        b.lineToRelative(-1.12f, -2.0f);
        b.lineToRelative(1.12f, -2.0f);
        b.horizontalLineToRelative(2.12f);
        b.lineToRelative(1.12f, 2.0f);
        gy.w(b, -1.12f, 2.0f, 10.94f);
        b.moveTo(13.08f, 4.0f);
        b.lineToRelative(1.12f, 1.98f);
        b.lineTo(13.06f, 8.0f);
        b.horizontalLineToRelative(-2.12f);
        b.lineTo(9.8f, 5.98f);
        kf0.h(b, 10.92f, 4.0f, 13.08f);
        b.moveTo(5.92f, 7.0f);
        b.horizontalLineToRelative(2.14f);
        b.lineToRelative(1.12f, 2.0f);
        b.lineToRelative(-1.12f, 2.0f);
        b.horizontalLineTo(5.92f);
        r6.C(b, 4.79f, 9.0f, 5.92f, 7.0f);
        b.moveTo(4.79f, 15.0f);
        b.lineToRelative(1.12f, -2.0f);
        b.horizontalLineToRelative(2.14f);
        b.lineToRelative(1.12f, 2.0f);
        b.lineToRelative(-1.12f, 2.0f);
        kf0.m(b, 5.92f, 4.79f, 15.0f);
        b.moveTo(10.92f, 20.0f);
        b.lineTo(9.8f, 18.02f);
        b.lineTo(10.94f, 16.0f);
        b.horizontalLineToRelative(2.12f);
        b.lineToRelative(1.13f, 2.02f);
        kf0.h(b, 13.08f, 20.0f, 10.92f);
        b.moveTo(18.08f, 17.0f);
        b.horizontalLineToRelative(-2.14f);
        b.lineToRelative(-1.12f, -2.0f);
        b.lineToRelative(1.12f, -2.0f);
        b.horizontalLineToRelative(2.14f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, 1.12f, 2.0f, 18.08f, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hive = build;
        build.getClass();
        return build;
    }
}
