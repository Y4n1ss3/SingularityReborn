package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ImportContactsKt {
    private static ImageVector _importContacts;

    public static final ImageVector getImportContacts(Icons.Sharp sharp) {
        ImageVector imageVector = _importContacts;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ImportContacts", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(21.0f, 5.0f);
        b.curveToRelative(-1.11f, -0.35f, -2.33f, -0.5f, -3.5f, -0.5f);
        b.curveToRelative(-1.95f, 0.0f, -4.05f, 0.4f, -5.5f, 1.5f);
        b.curveToRelative(-1.45f, -1.1f, -3.55f, -1.5f, -5.5f, -1.5f);
        b.reflectiveCurveTo(2.45f, 4.9f, 1.0f, 6.0f);
        b.verticalLineToRelative(15.5f);
        b.curveTo(2.45f, 20.4f, 4.55f, 20.0f, 6.5f, 20.0f);
        b.reflectiveCurveToRelative(4.05f, 0.4f, 5.5f, 1.5f);
        b.curveToRelative(1.45f, -1.1f, 3.55f, -1.5f, 5.5f, -1.5f);
        b.curveToRelative(1.17f, 0.0f, 2.39f, 0.15f, 3.5f, 0.5f);
        b.curveToRelative(0.75f, 0.25f, 1.4f, 0.55f, 2.0f, 1.0f);
        b.lineTo(23.0f, 6.0f);
        b.curveToRelative(-0.6f, -0.45f, -1.25f, -0.75f, -2.0f, -1.0f);
        b.close();
        b.moveTo(21.0f, 18.5f);
        b.curveToRelative(-1.1f, -0.35f, -2.3f, -0.5f, -3.5f, -0.5f);
        b.curveToRelative(-1.7f, 0.0f, -4.15f, 0.65f, -5.5f, 1.5f);
        b.lineTo(12.0f, 8.0f);
        b.curveToRelative(1.35f, -0.85f, 3.8f, -1.5f, 5.5f, -1.5f);
        b.curveToRelative(1.2f, 0.0f, 2.4f, 0.15f, 3.5f, 0.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(b, 11.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _importContacts = build;
        build.getClass();
        return build;
    }
}
