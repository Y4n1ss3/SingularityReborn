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
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AssistantKt {
    private static ImageVector _assistant;

    public static final ImageVector getAssistant(Icons.TwoTone twoTone) {
        ImageVector imageVector = _assistant;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Assistant", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(9.83f, 18.0f, 0.59f, 0.59f);
        e.lineTo(12.0f, 20.17f);
        e.lineToRelative(1.59f, -1.59f);
        e.lineToRelative(0.58f, -0.58f);
        e.lineTo(19.0f, 18.0f);
        e.lineTo(19.0f, 4.0f);
        kp0.x(e, 5.0f, 4.0f, 14.0f, 4.83f);
        e.moveTo(10.12f, 9.12f);
        e.lineTo(12.0f, 5.0f);
        e.lineToRelative(1.88f, 4.12f);
        e.lineTo(18.0f, 11.0f);
        e.lineToRelative(-4.12f, 1.88f);
        e.lineTo(12.0f, 17.0f);
        e.lineToRelative(-1.88f, -4.12f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.u(e, 6.0f, 11.0f, 4.12f, -1.88f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(5.0f, 20.0f, 4.0f, 3.0f, 3.0f);
        i.lineToRelative(3.0f, -3.0f);
        i.horizontalLineToRelative(4.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.lineTo(21.0f, 4.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        i.lineTo(5.0f, 2.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.verticalLineToRelative(14.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        r6.B(i, 5.0f, 4.0f, 14.0f, 14.0f);
        i.horizontalLineToRelative(-4.83f);
        i.lineToRelative(-0.59f, 0.59f);
        i.lineTo(12.0f, 20.17f);
        i.lineToRelative(-1.59f, -1.59f);
        i.lineToRelative(-0.58f, -0.58f);
        r6.C(i, 5.0f, 18.0f, 5.0f, 4.0f);
        i.moveTo(12.0f, 17.0f);
        i.lineToRelative(1.88f, -4.12f);
        i.lineTo(18.0f, 11.0f);
        i.lineToRelative(-4.12f, -1.88f);
        i.lineTo(12.0f, 5.0f);
        i.lineToRelative(-1.88f, 4.12f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.u(i, 6.0f, 11.0f, 4.12f, 1.88f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _assistant = build;
        build.getClass();
        return build;
    }
}
