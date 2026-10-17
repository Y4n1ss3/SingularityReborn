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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PersonPinKt {
    private static ImageVector _personPin;

    public static final ImageVector getPersonPin(Icons.Filled filled) {
        ImageVector imageVector = _personPin;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PersonPin", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
        b.curveToRelative(0.0f, 4.17f, 2.84f, 7.67f, 6.69f, 8.69f);
        b.lineTo(12.0f, 22.0f);
        b.lineToRelative(2.31f, -2.31f);
        b.curveTo(18.16f, 18.67f, 21.0f, 15.17f, 21.0f, 11.0f);
        b.curveToRelative(0.0f, -4.97f, -4.03f, -9.0f, -9.0f, -9.0f);
        b.close();
        b.moveTo(12.0f, 4.0f);
        b.curveToRelative(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f);
        b.reflectiveCurveToRelative(-1.34f, 3.0f, -3.0f, 3.0f);
        b.reflectiveCurveToRelative(-3.0f, -1.34f, -3.0f, -3.0f);
        b.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        b.close();
        b.moveTo(12.0f, 18.3f);
        b.curveToRelative(-2.5f, 0.0f, -4.71f, -1.28f, -6.0f, -3.22f);
        b.curveToRelative(0.03f, -1.99f, 4.0f, -3.08f, 6.0f, -3.08f);
        b.curveToRelative(1.99f, 0.0f, 5.97f, 1.09f, 6.0f, 3.08f);
        b.curveToRelative(-1.29f, 1.94f, -3.5f, 3.22f, -6.0f, 3.22f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _personPin = build;
        build.getClass();
        return build;
    }
}
