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
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class UnsubscribeKt {
    private static ImageVector _unsubscribe;

    public static final ImageVector getUnsubscribe(Icons.Outlined outlined) {
        ImageVector imageVector = _unsubscribe;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Unsubscribe", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(20.99f, 14.04f, 20.99f, 5.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        i.lineTo(5.0f, 3.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.verticalLineToRelative(10.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(10.05f);
        i.curveToRelative(0.28f, 1.92f, 2.1f, 3.35f, 4.18f, 2.93f);
        i.curveToRelative(1.34f, -0.27f, 2.43f, -1.37f, 2.7f, -2.71f);
        i.curveToRelative(0.25f, -1.24f, -0.16f, -2.39f, -0.94f, -3.18f);
        k4.r(i, 18.99f, 5.0f, 12.0f, 8.5f);
        uf.j(i, 5.0f, 5.0f, 13.99f);
        i.moveTo(15.35f, 15.0f);
        i.lineTo(5.0f, 15.0f);
        i.lineTo(5.0f, 7.0f);
        i.lineToRelative(7.0f, 3.5f);
        i.lineTo(19.0f, 7.0f);
        i.verticalLineToRelative(6.05f);
        i.curveToRelative(-0.16f, -0.02f, -0.33f, -0.05f, -0.5f, -0.05f);
        i.curveToRelative(-1.39f, 0.0f, -2.59f, 0.82f, -3.15f, 2.0f);
        r6.B(i, 20.5f, 17.0f, -4.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.v(i, 4.0f, 1.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _unsubscribe = build;
        build.getClass();
        return build;
    }
}
