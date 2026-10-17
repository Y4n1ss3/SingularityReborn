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

    public static final ImageVector getDocumentScanner(Icons.Filled filled) {
        ImageVector imageVector = _documentScanner;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.DocumentScanner", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uo.b(7.0f, 3.0f, 4.0f, 3.0f, 2.0f);
        c21.c(b, 1.0f, 5.0f, 3.0f);
        kp0.t(b, 22.0f, 6.0f, 1.0f, -5.0f);
        fc.y(b, 2.0f, 3.0f, 3.0f, 22.0f);
        k4.A(b, 7.0f, 21.0f, 4.0f, -3.0f);
        bv.h(b, 2.0f, 5.0f, 5.0f, 21.0f);
        bv.y(b, 20.0f, 18.0f, 3.0f, -3.0f);
        fc.y(b, 2.0f, 5.0f, -5.0f, 20.0f);
        b.moveTo(19.0f, 18.0f);
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
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, c21.e(b, 9.0f, 2.0f, 6.0f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _documentScanner = build;
        build.getClass();
        return build;
    }
}
