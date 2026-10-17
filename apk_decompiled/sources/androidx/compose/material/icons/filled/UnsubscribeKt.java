package androidx.compose.material.icons.filled;

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
import defpackage.j50;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class UnsubscribeKt {
    private static ImageVector _unsubscribe;

    public static final ImageVector getUnsubscribe(Icons.Filled filled) {
        ImageVector imageVector = _unsubscribe;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Unsubscribe", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.5f, 13.0f);
        b.curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f);
        b.reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f);
        b.reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f);
        b.reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f);
        r6.B(b, 20.5f, 17.0f, -4.0f, -1.0f);
        fc.x(b, 4.0f, 1.0f, 13.55f, 17.0f);
        b.curveToRelative(-0.02f, -0.17f, -0.05f, -0.33f, -0.05f, -0.5f);
        b.curveToRelative(0.0f, -2.76f, 2.24f, -5.0f, 5.0f, -5.0f);
        b.curveToRelative(0.92f, 0.0f, 1.76f, 0.26f, 2.5f, 0.69f);
        b.lineTo(21.0f, 5.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        b.lineTo(5.0f, 3.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        b.verticalLineToRelative(10.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        j50.t(b, 8.55f, 12.0f, 10.5f);
        b.lineTo(5.0f, 7.0f);
        b.lineTo(5.0f, 5.0f);
        b.lineToRelative(7.0f, 3.5f);
        b.lineTo(19.0f, 5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.o(b, 2.0f, -7.0f, 3.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _unsubscribe = build;
        build.getClass();
        return build;
    }
}
