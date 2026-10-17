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
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VideocamOffKt {
    private static ImageVector _videocamOff;

    public static final ImageVector getVideocamOff(Icons.Outlined outlined) {
        ImageVector imageVector = _videocamOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.VideocamOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(9.56f, 8.0f, -2.0f, -2.0f);
        e.lineToRelative(-4.15f, -4.14f);
        e.lineTo(2.0f, 3.27f);
        e.lineTo(4.73f, 6.0f);
        e.lineTo(4.0f, 6.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        e.verticalLineToRelative(10.0f);
        e.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        e.horizontalLineToRelative(12.0f);
        e.curveToRelative(0.21f, 0.0f, 0.39f, -0.08f, 0.55f, -0.18f);
        e.lineTo(19.73f, 21.0f);
        e.lineToRelative(1.41f, -1.41f);
        gy.B(e, -8.86f, -8.86f, 9.56f, 8.0f);
        e.moveTo(5.0f, 16.0f);
        e.lineTo(5.0f, 8.0f);
        e.horizontalLineToRelative(1.73f);
        gy.B(e, 8.0f, 8.0f, 5.0f, 16.0f);
        e.moveTo(15.0f, 8.0f);
        e.verticalLineToRelative(2.61f);
        e.lineToRelative(6.0f, 6.0f);
        e.lineTo(21.0f, 6.5f);
        e.lineToRelative(-4.0f, 4.0f);
        e.lineTo(17.0f, 7.0f);
        e.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        e.horizontalLineToRelative(-5.61f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(e, 2.0f, 2.0f, 15.0f, 8.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _videocamOff = build;
        build.getClass();
        return build;
    }
}
