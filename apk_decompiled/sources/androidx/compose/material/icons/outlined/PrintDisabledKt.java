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
import defpackage.af0;
import defpackage.bv;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PrintDisabledKt {
    private static ImageVector _printDisabled;

    public static final ImageVector getPrintDisabled(Icons.Outlined outlined) {
        ImageVector imageVector = _printDisabled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PrintDisabled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(1.41f, 1.6f, 0.0f, 3.01f);
        i.lineTo(5.0f, 8.0f);
        i.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        r6.D(i, 6.0f, 4.0f, 4.0f, 12.0f);
        i.lineToRelative(2.95f, 2.96f);
        gy.B(i, 1.41f, -1.41f, 1.41f, 1.6f);
        i.moveTo(6.0f, 15.0f);
        i.lineTo(4.0f, 15.0f);
        i.verticalLineToRelative(-4.0f);
        i.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        i.horizontalLineToRelative(2.0f);
        i.lineToRelative(3.0f, 3.0f);
        bv.r(i, 6.0f, 13.0f, 2.0f);
        bv.y(i, 8.0f, 19.0f, -4.0f, 4.0f);
        gy.B(i, 4.0f, 4.0f, 8.0f, 19.0f);
        k4.C(i, 8.0f, 5.0f, 8.0f, 3.0f);
        i.horizontalLineToRelative(-5.34f);
        i.lineToRelative(2.0f, 2.0f);
        i.lineTo(19.0f, 10.0f);
        i.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        i.verticalLineToRelative(4.0f);
        i.lineToRelative(-2.0f, 0.01f);
        i.lineTo(18.0f, 13.0f);
        i.horizontalLineToRelative(-2.34f);
        i.lineToRelative(4.0f, 4.0f);
        i.lineTo(22.0f, 17.0f);
        i.verticalLineToRelative(-6.0f);
        i.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        i.horizontalLineToRelative(-1.0f);
        i.lineTo(18.0f, 3.0f);
        i.lineTo(6.0f, 3.0f);
        i.verticalLineToRelative(0.36f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(i, 2.0f, 2.0f, 8.0f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(18.0f, 11.51f, -1.0f, 0.0f);
        b.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        b.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _printDisabled = build;
        build.getClass();
        return build;
    }
}
