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
import defpackage.bv;
import defpackage.c21;
import defpackage.fc;
import defpackage.k4;
import defpackage.kp0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DocumentScannerKt {
    private static ImageVector _documentScanner;

    public static final ImageVector getDocumentScanner(Icons.TwoTone twoTone) {
        ImageVector imageVector = _documentScanner;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.DocumentScanner", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder w = kp0.w(7.0f, 6.0f, 12.0f, 10.0f, 6.0f);
        kp0.B(w, 7.0f, 15.0f, 16.0f, 9.0f);
        k4.p(w, -2.0f, 6.0f, 16.0f);
        k4.A(w, 15.0f, 13.0f, 9.0f, -2.0f);
        uo.r(w, 6.0f, 13.0f, 15.0f, 10.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kp0.o(w, 9.0f, 8.0f, 6.0f, 10.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uo.b(7.0f, 3.0f, 4.0f, 3.0f, 2.0f);
        c21.c(b, 1.0f, 5.0f, 3.0f);
        kp0.t(b, 22.0f, 6.0f, 1.0f, -5.0f);
        fc.y(b, 2.0f, 3.0f, 3.0f, 22.0f);
        k4.A(b, 7.0f, 21.0f, 4.0f, -3.0f);
        bv.h(b, 2.0f, 5.0f, 5.0f, 21.0f);
        bv.y(b, 20.0f, 18.0f, 3.0f, -3.0f);
        fc.y(b, 2.0f, 5.0f, -5.0f, 20.0f);
        k4.A(b, 17.0f, 6.0f, 7.0f, 12.0f);
        uo.r(b, 10.0f, 6.0f, 19.0f, 18.0f);
        b.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        b.horizontalLineTo(7.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        b.verticalLineTo(6.0f);
        b.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        b.horizontalLineToRelative(10.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        k4.B(b, 18.0f, 15.0f, 8.0f, 9.0f);
        k4.p(b, 2.0f, 6.0f, 8.0f);
        k4.A(b, 15.0f, 11.0f, 9.0f, 2.0f);
        uo.r(b, 6.0f, 11.0f, 15.0f, 14.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, c21.e(b, 9.0f, 2.0f, 6.0f, 14.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _documentScanner = build;
        build.getClass();
        return build;
    }
}
