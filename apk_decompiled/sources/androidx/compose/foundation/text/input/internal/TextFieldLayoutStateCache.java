package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateRecord;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dq;
import defpackage.ks0;
import defpackage.ky;
import defpackage.o;
import defpackage.q10;
import defpackage.uf;
import defpackage.ut;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldLayoutStateCache implements State<TextLayoutResult>, StateObject {
    public static final int $stable = 0;
    private TextMeasurer textMeasurer;
    private final MutableState nonMeasureInputs$delegate = SnapshotStateKt.mutableStateOf(null, NonMeasureInputs.Companion.getMutationPolicy());
    private final MutableState measureInputs$delegate = SnapshotStateKt.mutableStateOf(null, MeasureInputs.Companion.getMutationPolicy());
    private CacheRecord record = new CacheRecord();

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class CacheRecord extends StateRecord {
        private List<AnnotatedString.Range<AnnotatedString.Annotation>> annotations;
        private TextRange composition;
        private FontFamily.Resolver fontFamilyResolver;
        private LayoutDirection layoutDirection;
        private TextLayoutResult layoutResult;
        private boolean singleLine;
        private boolean softWrap;
        private TextStyle textStyle;
        private CharSequence visualText;
        private float densityValue = Float.NaN;
        private float fontScale = Float.NaN;
        private long constraints = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord stateRecord) {
            stateRecord.getClass();
            CacheRecord cacheRecord = (CacheRecord) stateRecord;
            this.visualText = cacheRecord.visualText;
            this.annotations = cacheRecord.annotations;
            this.composition = cacheRecord.composition;
            this.textStyle = cacheRecord.textStyle;
            this.singleLine = cacheRecord.singleLine;
            this.softWrap = cacheRecord.softWrap;
            this.densityValue = cacheRecord.densityValue;
            this.fontScale = cacheRecord.fontScale;
            this.layoutDirection = cacheRecord.layoutDirection;
            this.fontFamilyResolver = cacheRecord.fontFamilyResolver;
            this.constraints = cacheRecord.constraints;
            this.layoutResult = cacheRecord.layoutResult;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create() {
            return new CacheRecord();
        }

        public final List<AnnotatedString.Range<AnnotatedString.Annotation>> getAnnotations() {
            return this.annotations;
        }

        /* renamed from: getComposition-MzsxiRA, reason: not valid java name */
        public final TextRange m1341getCompositionMzsxiRA() {
            return this.composition;
        }

        /* renamed from: getConstraints-msEJaDk, reason: not valid java name */
        public final long m1342getConstraintsmsEJaDk() {
            return this.constraints;
        }

        public final float getDensityValue() {
            return this.densityValue;
        }

        public final FontFamily.Resolver getFontFamilyResolver() {
            return this.fontFamilyResolver;
        }

        public final float getFontScale() {
            return this.fontScale;
        }

        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        public final TextLayoutResult getLayoutResult() {
            return this.layoutResult;
        }

        public final boolean getSingleLine() {
            return this.singleLine;
        }

        public final boolean getSoftWrap() {
            return this.softWrap;
        }

        public final TextStyle getTextStyle() {
            return this.textStyle;
        }

        public final CharSequence getVisualText() {
            return this.visualText;
        }

        public final void setAnnotations(List<AnnotatedString.Range<AnnotatedString.Annotation>> list) {
            this.annotations = list;
        }

        /* renamed from: setComposition-OEnZFl4, reason: not valid java name */
        public final void m1343setCompositionOEnZFl4(TextRange textRange) {
            this.composition = textRange;
        }

        /* renamed from: setConstraints-BRTryo0, reason: not valid java name */
        public final void m1344setConstraintsBRTryo0(long j) {
            this.constraints = j;
        }

        public final void setDensityValue(float f) {
            this.densityValue = f;
        }

        public final void setFontFamilyResolver(FontFamily.Resolver resolver) {
            this.fontFamilyResolver = resolver;
        }

        public final void setFontScale(float f) {
            this.fontScale = f;
        }

        public final void setLayoutDirection(LayoutDirection layoutDirection) {
            this.layoutDirection = layoutDirection;
        }

        public final void setLayoutResult(TextLayoutResult textLayoutResult) {
            this.layoutResult = textLayoutResult;
        }

        public final void setSingleLine(boolean z) {
            this.singleLine = z;
        }

        public final void setSoftWrap(boolean z) {
            this.softWrap = z;
        }

        public final void setTextStyle(TextStyle textStyle) {
            this.textStyle = textStyle;
        }

        public final void setVisualText(CharSequence charSequence) {
            this.visualText = charSequence;
        }

        public String toString() {
            return "CacheRecord(visualText=" + ((Object) this.visualText) + ", annotations=" + this.annotations + ", composition=" + this.composition + ", textStyle=" + this.textStyle + ", singleLine=" + this.singleLine + ", softWrap=" + this.softWrap + ", densityValue=" + this.densityValue + ", fontScale=" + this.fontScale + ", layoutDirection=" + this.layoutDirection + ", fontFamilyResolver=" + this.fontFamilyResolver + ", constraints=" + ((Object) Constraints.m7569toStringimpl(this.constraints)) + ", layoutResult=" + this.layoutResult + ')';
        }
    }

    private final TextLayoutResult computeLayout(TextFieldCharSequence textFieldCharSequence, List<AnnotatedString.Range<AnnotatedString.Annotation>> list, NonMeasureInputs nonMeasureInputs, MeasureInputs measureInputs) {
        TextStyle textStyle;
        Locale current;
        TextMeasurer obtainTextMeasurer = obtainTextMeasurer(measureInputs);
        if (nonMeasureInputs.isKeyboardTypePhone()) {
            LocaleList localeList = nonMeasureInputs.getTextStyle().getLocaleList();
            if (localeList == null || (current = localeList.get(0)) == null) {
                current = Locale.Companion.getCurrent();
            }
            textStyle = nonMeasureInputs.getTextStyle().merge(new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, TextFieldLayoutStateCache_androidKt.resolveTextDirectionForKeyboardTypePhone(current.getPlatformLocale()), 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16711679, (dq) null));
        } else {
            textStyle = nonMeasureInputs.getTextStyle();
        }
        return TextMeasurer.m7034measurexDpz5zY$default(obtainTextMeasurer, new AnnotatedString(textFieldCharSequence.toString(), list == null ? ut.d : list), textStyle, 0, nonMeasureInputs.getSoftWrap(), nonMeasureInputs.getSingleLine() ? 1 : Integer.MAX_VALUE, null, measureInputs.m1345getConstraintsmsEJaDk(), measureInputs.getLayoutDirection(), measureInputs.getDensity(), measureInputs.getFontFamilyResolver(), false, 1060, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final MeasureInputs getMeasureInputs() {
        return (MeasureInputs) this.measureInputs$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final NonMeasureInputs getNonMeasureInputs() {
        return (NonMeasureInputs) this.nonMeasureInputs$delegate.getValue();
    }

    private final TextLayoutResult getOrComputeLayout(NonMeasureInputs nonMeasureInputs, MeasureInputs measureInputs) {
        List<AnnotatedString.Range<AnnotatedString.Annotation>> mergeNullableLists;
        CharSequence visualText;
        TextFieldCharSequence visualText2 = nonMeasureInputs.getTextFieldState().getVisualText();
        mergeNullableLists = TextFieldLayoutStateCacheKt.mergeNullableLists(visualText2.getComposingAnnotations(), visualText2.getOutputAnnotations());
        CacheRecord cacheRecord = (CacheRecord) SnapshotKt.current(this.record);
        TextLayoutResult layoutResult = cacheRecord.getLayoutResult();
        if (layoutResult != null && (visualText = cacheRecord.getVisualText()) != null && ks0.Y(visualText, visualText2) && q10.b(cacheRecord.getAnnotations(), mergeNullableLists) && q10.b(cacheRecord.m1341getCompositionMzsxiRA(), visualText2.m1238getCompositionMzsxiRA()) && cacheRecord.getSingleLine() == nonMeasureInputs.getSingleLine() && cacheRecord.getSoftWrap() == nonMeasureInputs.getSoftWrap() && cacheRecord.getLayoutDirection() == measureInputs.getLayoutDirection() && cacheRecord.getDensityValue() == measureInputs.getDensity().getDensity() && cacheRecord.getFontScale() == measureInputs.getDensity().getFontScale() && Constraints.m7557equalsimpl0(cacheRecord.m1342getConstraintsmsEJaDk(), measureInputs.m1345getConstraintsmsEJaDk()) && q10.b(cacheRecord.getFontFamilyResolver(), measureInputs.getFontFamilyResolver()) && !layoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts()) {
            TextStyle textStyle = cacheRecord.getTextStyle();
            boolean hasSameLayoutAffectingAttributes = textStyle != null ? textStyle.hasSameLayoutAffectingAttributes(nonMeasureInputs.getTextStyle()) : false;
            TextStyle textStyle2 = cacheRecord.getTextStyle();
            boolean hasSameDrawAffectingAttributes = textStyle2 != null ? textStyle2.hasSameDrawAffectingAttributes(nonMeasureInputs.getTextStyle()) : false;
            if (hasSameLayoutAffectingAttributes && hasSameDrawAffectingAttributes) {
                return layoutResult;
            }
            if (hasSameLayoutAffectingAttributes) {
                return TextLayoutResult.m7028copyO0kMr_c$default(layoutResult, new TextLayoutInput(layoutResult.getLayoutInput().getText(), nonMeasureInputs.getTextStyle(), layoutResult.getLayoutInput().getPlaceholders(), layoutResult.getLayoutInput().getMaxLines(), layoutResult.getLayoutInput().getSoftWrap(), layoutResult.getLayoutInput().m7027getOverflowgIe3tQ8(), layoutResult.getLayoutInput().getDensity(), layoutResult.getLayoutInput().getLayoutDirection(), layoutResult.getLayoutInput().getFontFamilyResolver(), layoutResult.getLayoutInput().m7026getConstraintsmsEJaDk(), (dq) null), 0L, 2, null);
            }
        }
        TextLayoutResult computeLayout = computeLayout(visualText2, mergeNullableLists, nonMeasureInputs, measureInputs);
        if (!q10.b(computeLayout, layoutResult)) {
            Snapshot current = Snapshot.Companion.getCurrent();
            if (!current.getReadOnly()) {
                CacheRecord cacheRecord2 = this.record;
                synchronized (SnapshotKt.getLock()) {
                    CacheRecord cacheRecord3 = (CacheRecord) SnapshotKt.writableRecord(cacheRecord2, this, current);
                    cacheRecord3.setVisualText(visualText2);
                    cacheRecord3.setAnnotations(mergeNullableLists);
                    cacheRecord3.m1343setCompositionOEnZFl4(visualText2.m1238getCompositionMzsxiRA());
                    cacheRecord3.setSingleLine(nonMeasureInputs.getSingleLine());
                    cacheRecord3.setSoftWrap(nonMeasureInputs.getSoftWrap());
                    cacheRecord3.setTextStyle(nonMeasureInputs.getTextStyle());
                    cacheRecord3.setLayoutDirection(measureInputs.getLayoutDirection());
                    cacheRecord3.setDensityValue(measureInputs.getDensityValue());
                    cacheRecord3.setFontScale(measureInputs.getFontScale());
                    cacheRecord3.m1344setConstraintsBRTryo0(measureInputs.m1345getConstraintsmsEJaDk());
                    cacheRecord3.setFontFamilyResolver(measureInputs.getFontFamilyResolver());
                    cacheRecord3.setLayoutResult(computeLayout);
                }
                SnapshotKt.notifyWrite(current, this);
                return computeLayout;
            }
        }
        return computeLayout;
    }

    private final TextMeasurer obtainTextMeasurer(MeasureInputs measureInputs) {
        TextMeasurer textMeasurer = this.textMeasurer;
        if (textMeasurer != null) {
            return textMeasurer;
        }
        TextMeasurer textMeasurer2 = new TextMeasurer(measureInputs.getFontFamilyResolver(), measureInputs.getDensity(), measureInputs.getLayoutDirection(), 1);
        this.textMeasurer = textMeasurer2;
        return textMeasurer2;
    }

    private final void setMeasureInputs(MeasureInputs measureInputs) {
        this.measureInputs$delegate.setValue(measureInputs);
    }

    private final void setNonMeasureInputs(NonMeasureInputs nonMeasureInputs) {
        this.nonMeasureInputs$delegate.setValue(nonMeasureInputs);
    }

    private final void updateCacheIfWritable(ky kyVar) {
        Snapshot current = Snapshot.Companion.getCurrent();
        if (current.getReadOnly()) {
            return;
        }
        CacheRecord cacheRecord = this.record;
        synchronized (SnapshotKt.getLock()) {
            kyVar.invoke(SnapshotKt.writableRecord(cacheRecord, this, current));
        }
        SnapshotKt.notifyWrite(current, this);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.record;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.State
    public TextLayoutResult getValue() {
        MeasureInputs measureInputs;
        NonMeasureInputs nonMeasureInputs = getNonMeasureInputs();
        if (nonMeasureInputs == null || (measureInputs = getMeasureInputs()) == null) {
            return null;
        }
        return getOrComputeLayout(nonMeasureInputs, measureInputs);
    }

    /* renamed from: layoutWithNewMeasureInputs--hBUhpc, reason: not valid java name */
    public final TextLayoutResult m1340layoutWithNewMeasureInputshBUhpc(Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j) {
        MeasureInputs measureInputs = new MeasureInputs(density, layoutDirection, resolver, j, null);
        setMeasureInputs(measureInputs);
        NonMeasureInputs nonMeasureInputs = getNonMeasureInputs();
        if (nonMeasureInputs != null) {
            return getOrComputeLayout(nonMeasureInputs, measureInputs);
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Called layoutWithNewMeasureInputs before updateNonMeasureInputs");
        o.j();
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord stateRecord) {
        stateRecord.getClass();
        this.record = (CacheRecord) stateRecord;
    }

    public final void updateNonMeasureInputs(TransformedTextFieldState transformedTextFieldState, TextStyle textStyle, boolean z, boolean z2, KeyboardOptions keyboardOptions) {
        setNonMeasureInputs(new NonMeasureInputs(transformedTextFieldState, textStyle, z, z2, KeyboardType.m7281equalsimpl0(keyboardOptions.m1133getKeyboardTypePjHm6EE(), KeyboardType.Companion.m7301getPhonePjHm6EE())));
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class MeasureInputs {
        public static final Companion Companion = new Companion(null);
        private static final SnapshotMutationPolicy<MeasureInputs> mutationPolicy = new SnapshotMutationPolicy<MeasureInputs>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache$MeasureInputs$Companion$mutationPolicy$1
            @Override // androidx.compose.runtime.SnapshotMutationPolicy
            public boolean equivalent(TextFieldLayoutStateCache.MeasureInputs measureInputs, TextFieldLayoutStateCache.MeasureInputs measureInputs2) {
                if (measureInputs == null || measureInputs2 == null) {
                    return !((measureInputs == null) ^ (measureInputs2 == null));
                }
                return measureInputs.getDensityValue() == measureInputs2.getDensityValue() && measureInputs.getFontScale() == measureInputs2.getFontScale() && measureInputs.getLayoutDirection() == measureInputs2.getLayoutDirection() && q10.b(measureInputs.getFontFamilyResolver(), measureInputs2.getFontFamilyResolver()) && Constraints.m7557equalsimpl0(measureInputs.m1345getConstraintsmsEJaDk(), measureInputs2.m1345getConstraintsmsEJaDk());
            }
        };
        private final long constraints;
        private final Density density;
        private final float densityValue;
        private final FontFamily.Resolver fontFamilyResolver;
        private final float fontScale;
        private final LayoutDirection layoutDirection;

        private MeasureInputs(Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j) {
            this.density = density;
            this.layoutDirection = layoutDirection;
            this.fontFamilyResolver = resolver;
            this.constraints = j;
            this.densityValue = density.getDensity();
            this.fontScale = density.getFontScale();
        }

        /* renamed from: getConstraints-msEJaDk, reason: not valid java name */
        public final long m1345getConstraintsmsEJaDk() {
            return this.constraints;
        }

        public final Density getDensity() {
            return this.density;
        }

        public final float getDensityValue() {
            return this.densityValue;
        }

        public final FontFamily.Resolver getFontFamilyResolver() {
            return this.fontFamilyResolver;
        }

        public final float getFontScale() {
            return this.fontScale;
        }

        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        public String toString() {
            return "MeasureInputs(density=" + this.density + ", densityValue=" + this.densityValue + ", fontScale=" + this.fontScale + ", layoutDirection=" + this.layoutDirection + ", fontFamilyResolver=" + this.fontFamilyResolver + ", constraints=" + ((Object) Constraints.m7569toStringimpl(this.constraints)) + ')';
        }

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class Companion {
            public /* synthetic */ Companion(dq dqVar) {
                this();
            }

            public final SnapshotMutationPolicy<MeasureInputs> getMutationPolicy() {
                return MeasureInputs.mutationPolicy;
            }

            private Companion() {
            }
        }

        public /* synthetic */ MeasureInputs(Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j, dq dqVar) {
            this(density, layoutDirection, resolver, j);
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class NonMeasureInputs {
        public static final Companion Companion = new Companion(null);
        private static final SnapshotMutationPolicy<NonMeasureInputs> mutationPolicy = new SnapshotMutationPolicy<NonMeasureInputs>() { // from class: androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache$NonMeasureInputs$Companion$mutationPolicy$1
            @Override // androidx.compose.runtime.SnapshotMutationPolicy
            public boolean equivalent(TextFieldLayoutStateCache.NonMeasureInputs nonMeasureInputs, TextFieldLayoutStateCache.NonMeasureInputs nonMeasureInputs2) {
                if (nonMeasureInputs == null || nonMeasureInputs2 == null) {
                    return !((nonMeasureInputs == null) ^ (nonMeasureInputs2 == null));
                }
                return nonMeasureInputs.getTextFieldState() == nonMeasureInputs2.getTextFieldState() && q10.b(nonMeasureInputs.getTextStyle(), nonMeasureInputs2.getTextStyle()) && nonMeasureInputs.getSingleLine() == nonMeasureInputs2.getSingleLine() && nonMeasureInputs.getSoftWrap() == nonMeasureInputs2.getSoftWrap() && nonMeasureInputs.isKeyboardTypePhone() == nonMeasureInputs2.isKeyboardTypePhone();
            }
        };
        private final boolean isKeyboardTypePhone;
        private final boolean singleLine;
        private final boolean softWrap;
        private final TransformedTextFieldState textFieldState;
        private final TextStyle textStyle;

        public NonMeasureInputs(TransformedTextFieldState transformedTextFieldState, TextStyle textStyle, boolean z, boolean z2, boolean z3) {
            this.textFieldState = transformedTextFieldState;
            this.textStyle = textStyle;
            this.singleLine = z;
            this.softWrap = z2;
            this.isKeyboardTypePhone = z3;
        }

        public final boolean getSingleLine() {
            return this.singleLine;
        }

        public final boolean getSoftWrap() {
            return this.softWrap;
        }

        public final TransformedTextFieldState getTextFieldState() {
            return this.textFieldState;
        }

        public final TextStyle getTextStyle() {
            return this.textStyle;
        }

        public final boolean isKeyboardTypePhone() {
            return this.isKeyboardTypePhone;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("NonMeasureInputs(textFieldState=");
            sb.append(this.textFieldState);
            sb.append(", textStyle=");
            sb.append(this.textStyle);
            sb.append(", singleLine=");
            sb.append(this.singleLine);
            sb.append(", softWrap=");
            sb.append(this.softWrap);
            sb.append(", isKeyboardTypePhone=");
            return uf.e(sb, this.isKeyboardTypePhone, ')');
        }

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        public static final class Companion {
            public /* synthetic */ Companion(dq dqVar) {
                this();
            }

            public final SnapshotMutationPolicy<NonMeasureInputs> getMutationPolicy() {
                return NonMeasureInputs.mutationPolicy;
            }

            private Companion() {
            }
        }
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord mergeRecords(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        return stateRecord3;
    }
}
