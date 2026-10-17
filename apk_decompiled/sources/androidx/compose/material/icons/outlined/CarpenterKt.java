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
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CarpenterKt {
    private static ImageVector _carpenter;

    public static final ImageVector getCarpenter(Icons.Outlined outlined) {
        ImageVector imageVector = _carpenter;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Carpenter", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(19.73f, 14.23f, 7.0f, 1.5f);
        i.lineTo(3.11f, 5.39f);
        i.lineToRelative(8.13f, 11.67f);
        i.curveToRelative(-0.78f, 0.78f, -0.78f, 2.05f, 0.0f, 2.83f);
        i.lineToRelative(1.41f, 1.41f);
        i.curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0.0f);
        i.lineToRelative(4.24f, -4.24f);
        i.curveTo(20.51f, 16.28f, 20.51f, 15.01f, 19.73f, 14.23f);
        k4.r(i, 5.71f, 5.62f, 7.0f, 4.33f);
        i.lineToRelative(8.49f, 8.49f);
        gy.B(i, -2.81f, 2.81f, 5.71f, 5.62f);
        i.moveTo(14.07f, 19.88f);
        i.lineToRelative(-1.41f, -1.41f);
        i.lineToRelative(4.24f, -4.24f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(i, 1.41f, 1.41f, 14.07f, 19.88f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _carpenter = build;
        build.getClass();
        return build;
    }
}
