package model;


public final class ProtobufTrafficFlowV5 {
    private ProtobufTrafficFlowV5() {}
    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }
    /**
     * <pre>
     * The enum TrafficCondition indicates the traffic status on the affected location.
     * </pre>
     *
     * Protobuf enum {@code model.traffic.TrafficCondition}
     */
    public enum TrafficCondition
            implements com.google.protobuf.ProtocolMessageEnum {
        /**
         * <code>LONG_QUEUES_TRAFFIC = 1;</code>
         */
        LONG_QUEUES_TRAFFIC(1),
        /**
         * <code>TRAFFIC_DARK_GREEN = 2;</code>
         */
        FREE_TRAFFIC(2),
        /**
         * <code>TRAFFIC_RED = 3;</code>
         */
        HEAVY_TRAFFIC(3),
        /**
         * <code>SLOW_TRAFFIC = 4;</code>
         */
        SLOW_TRAFFIC(4),
        /**
         * <code>QUEUING_TRAFFIC = 5;</code>
         */
        QUEUING_TRAFFIC(5),
        /**
         * <code>STATIONARY_TRAFFIC = 6;</code>
         */
        STATIONARY_TRAFFIC(6),
        /**
         * <code>CLOSED = 7;</code>
         */
        CLOSED(7),
        /**
         * <code>UNKNOWN = 8;</code>
         */
        UNKNOWN(8),
        ;

        /**
         * <code>LONG_QUEUES_TRAFFIC = 1;</code>
         */
        public static final int LONG_QUEUES_TRAFFIC_VALUE = 1;
        /**
         * <code>TRAFFIC_DARK_GREEN = 2;</code>
         */
        public static final int FREE_TRAFFIC_VALUE = 2;
        /**
         * <code>TRAFFIC_RED = 3;</code>
         */
        public static final int HEAVY_TRAFFIC_VALUE = 3;
        /**
         * <code>SLOW_TRAFFIC = 4;</code>
         */
        public static final int SLOW_TRAFFIC_VALUE = 4;
        /**
         * <code>QUEUING_TRAFFIC = 5;</code>
         */
        public static final int QUEUING_TRAFFIC_VALUE = 5;
        /**
         * <code>STATIONARY_TRAFFIC = 6;</code>
         */
        public static final int STATIONARY_TRAFFIC_VALUE = 6;
        /**
         * <code>CLOSED = 7;</code>
         */
        public static final int CLOSED_VALUE = 7;
        /**
         * <code>UNKNOWN = 8;</code>
         */
        public static final int UNKNOWN_VALUE = 8;


        public final int getNumber() {
            return value;
        }

        /**
         * @deprecated Use {@link #forNumber(int)} instead.
         */
        @Deprecated
        public static TrafficCondition valueOf(int value) {
            return forNumber(value);
        }

        public static TrafficCondition forNumber(int value) {
            switch (value) {
                case 1: return LONG_QUEUES_TRAFFIC;
                case 2: return FREE_TRAFFIC;
                case 3: return HEAVY_TRAFFIC;
                case 4: return SLOW_TRAFFIC;
                case 5: return QUEUING_TRAFFIC;
                case 6: return STATIONARY_TRAFFIC;
                case 7: return CLOSED;
                case 8: return UNKNOWN;
                default: return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<TrafficCondition>
        internalGetValueMap() {
            return internalValueMap;
        }
        private static final com.google.protobuf.Internal.EnumLiteMap<
                TrafficCondition> internalValueMap =
                new com.google.protobuf.Internal.EnumLiteMap<TrafficCondition>() {
                    public TrafficCondition findValueByNumber(int number) {
                        return TrafficCondition.forNumber(number);
                    }
                };

        public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
            return getDescriptor().getValues().get(ordinal());
        }
        public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
            return getDescriptor();
        }
        public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
            return ProtobufTrafficFlowV5.getDescriptor().getEnumTypes().get(0);
        }

        private static final TrafficCondition[] VALUES = values();

        public static TrafficCondition valueOf(
                com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException(
                        "EnumValueDescriptor is not for this type.");
            }
            return VALUES[desc.getIndex()];
        }

        private final int value;

        private TrafficCondition(int value) {
            this.value = value;
        }

        // @@protoc_insertion_point(enum_scope:model.traffic.TrafficCondition)
    }

    public interface TrafficFlowGroupOrBuilder extends
            // @@protoc_insertion_point(interface_extends:model.traffic.TrafficFlowGroup)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <pre>
         * The shared meta information.
         * </pre>
         *
         * <code>optional .model.traffic.MetaInformation metaInformation = 1;</code>
         */
        boolean hasMetaInformation();
        /**
         * <pre>
         * The shared meta information.
         * </pre>
         *
         * <code>optional .model.traffic.MetaInformation metaInformation = 1;</code>
         */
        MetaInformation getMetaInformation();
        /**
         * <pre>
         * The shared meta information.
         * </pre>
         *
         * <code>optional .model.traffic.MetaInformation metaInformation = 1;</code>
         */
        MetaInformationOrBuilder getMetaInformationOrBuilder();

        /**
         * <pre>
         * The list of traffic flow elements.
         * </pre>
         *
         * <code>repeated .model.traffic.TrafficFlow trafficFlow = 2;</code>
         */
        java.util.List<TrafficFlow>
        getTrafficFlowList();
        /**
         * <pre>
         * The list of traffic flow elements.
         * </pre>
         *
         * <code>repeated .model.traffic.TrafficFlow trafficFlow = 2;</code>
         */
        TrafficFlow getTrafficFlow(int index);
        /**
         * <pre>
         * The list of traffic flow elements.
         * </pre>
         *
         * <code>repeated .model.traffic.TrafficFlow trafficFlow = 2;</code>
         */
        int getTrafficFlowCount();
        /**
         * <pre>
         * The list of traffic flow elements.
         * </pre>
         *
         * <code>repeated .model.traffic.TrafficFlow trafficFlow = 2;</code>
         */
        java.util.List<? extends TrafficFlowOrBuilder>
        getTrafficFlowOrBuilderList();
        /**
         * <pre>
         * The list of traffic flow elements.
         * </pre>
         *
         * <code>repeated .model.traffic.TrafficFlow trafficFlow = 2;</code>
         */
        TrafficFlowOrBuilder getTrafficFlowOrBuilder(
                int index);

        /**
         * <pre>
         * The list of traffic flow elements which can also provide predictive flow data.
         * </pre>
         *
         * <code>repeated .model.traffic.TrafficFlowWithPrediction trafficFlowWithPrediction = 3;</code>
         */
        java.util.List<TrafficFlowWithPrediction>
        getTrafficFlowWithPredictionList();
        /**
         * <pre>
         * The list of traffic flow elements which can also provide predictive flow data.
         * </pre>
         *
         * <code>repeated .model.traffic.TrafficFlowWithPrediction trafficFlowWithPrediction = 3;</code>
         */
        TrafficFlowWithPrediction getTrafficFlowWithPrediction(int index);
        /**
         * <pre>
         * The list of traffic flow elements which can also provide predictive flow data.
         * </pre>
         *
         * <code>repeated .model.traffic.TrafficFlowWithPrediction trafficFlowWithPrediction = 3;</code>
         */
        int getTrafficFlowWithPredictionCount();
        /**
         * <pre>
         * The list of traffic flow elements which can also provide predictive flow data.
         * </pre>
         *
         * <code>repeated .model.traffic.TrafficFlowWithPrediction trafficFlowWithPrediction = 3;</code>
         */
        java.util.List<? extends TrafficFlowWithPredictionOrBuilder>
        getTrafficFlowWithPredictionOrBuilderList();
        /**
         * <pre>
         * The list of traffic flow elements which can also provide predictive flow data.
         * </pre>
         *
         * <code>repeated .model.traffic.TrafficFlowWithPrediction trafficFlowWithPrediction = 3;</code>
         */
        TrafficFlowWithPredictionOrBuilder getTrafficFlowWithPredictionOrBuilder(
                int index);

        /**
         * <pre>
         * The list of traffic flow elements with a higher spatial resolution for speeds
         * and predictive flow data.
         * </pre>
         *
         * <code>repeated .model.traffic.TrafficFlowWithPredictionPerSection trafficFlowWithPredictionPerSection = 4;</code>
         */
        java.util.List<TrafficFlowWithPredictionPerSection>
        getTrafficFlowWithPredictionPerSectionList();
        /**
         * <pre>
         * The list of traffic flow elements with a higher spatial resolution for speeds
         * and predictive flow data.
         * </pre>
         *
         * <code>repeated .model.traffic.TrafficFlowWithPredictionPerSection trafficFlowWithPredictionPerSection = 4;</code>
         */
        TrafficFlowWithPredictionPerSection getTrafficFlowWithPredictionPerSection(int index);
        /**
         * <pre>
         * The list of traffic flow elements with a higher spatial resolution for speeds
         * and predictive flow data.
         * </pre>
         *
         * <code>repeated .model.traffic.TrafficFlowWithPredictionPerSection trafficFlowWithPredictionPerSection = 4;</code>
         */
        int getTrafficFlowWithPredictionPerSectionCount();
        /**
         * <pre>
         * The list of traffic flow elements with a higher spatial resolution for speeds
         * and predictive flow data.
         * </pre>
         *
         * <code>repeated .model.traffic.TrafficFlowWithPredictionPerSection trafficFlowWithPredictionPerSection = 4;</code>
         */
        java.util.List<? extends TrafficFlowWithPredictionPerSectionOrBuilder>
        getTrafficFlowWithPredictionPerSectionOrBuilderList();
        /**
         * <pre>
         * The list of traffic flow elements with a higher spatial resolution for speeds
         * and predictive flow data.
         * </pre>
         *
         * <code>repeated .model.traffic.TrafficFlowWithPredictionPerSection trafficFlowWithPredictionPerSection = 4;</code>
         */
        TrafficFlowWithPredictionPerSectionOrBuilder getTrafficFlowWithPredictionPerSectionOrBuilder(
                int index);
    }
    /**
     * <pre>
     * The traffic flow group is the top level message. It provides meta data
     * covering general information about the flow data and the flow data itself.
     * </pre>
     *
     * Protobuf type {@code model.traffic.TrafficFlowGroup}
     */
    public  static final class TrafficFlowGroup extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:model.traffic.TrafficFlowGroup)
            TrafficFlowGroupOrBuilder {
        // Use TrafficFlowGroup.newBuilder() to construct.
        private TrafficFlowGroup(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private TrafficFlowGroup() {
            trafficFlow_ = java.util.Collections.emptyList();
            trafficFlowWithPrediction_ = java.util.Collections.emptyList();
            trafficFlowWithPredictionPerSection_ = java.util.Collections.emptyList();
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private TrafficFlowGroup(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            MetaInformation.Builder subBuilder = null;
                            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                                subBuilder = metaInformation_.toBuilder();
                            }
                            metaInformation_ = input.readMessage(MetaInformation.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(metaInformation_);
                                metaInformation_ = subBuilder.buildPartial();
                            }
                            bitField0_ |= 0x00000001;
                            break;
                        }
                        case 18: {
                            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                                trafficFlow_ = new java.util.ArrayList<TrafficFlow>();
                                mutable_bitField0_ |= 0x00000002;
                            }
                            trafficFlow_.add(
                                    input.readMessage(TrafficFlow.PARSER, extensionRegistry));
                            break;
                        }
                        case 26: {
                            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                                trafficFlowWithPrediction_ = new java.util.ArrayList<TrafficFlowWithPrediction>();
                                mutable_bitField0_ |= 0x00000004;
                            }
                            trafficFlowWithPrediction_.add(
                                    input.readMessage(TrafficFlowWithPrediction.PARSER, extensionRegistry));
                            break;
                        }
                        case 34: {
                            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                                trafficFlowWithPredictionPerSection_ = new java.util.ArrayList<TrafficFlowWithPredictionPerSection>();
                                mutable_bitField0_ |= 0x00000008;
                            }
                            trafficFlowWithPredictionPerSection_.add(
                                    input.readMessage(TrafficFlowWithPredictionPerSection.PARSER, extensionRegistry));
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                    trafficFlow_ = java.util.Collections.unmodifiableList(trafficFlow_);
                }
                if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                    trafficFlowWithPrediction_ = java.util.Collections.unmodifiableList(trafficFlowWithPrediction_);
                }
                if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                    trafficFlowWithPredictionPerSection_ = java.util.Collections.unmodifiableList(trafficFlowWithPredictionPerSection_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return ProtobufTrafficFlowV5.internal_static_model_traffic_TrafficFlowGroup_descriptor;
        }

        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return ProtobufTrafficFlowV5.internal_static_model_traffic_TrafficFlowGroup_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            TrafficFlowGroup.class, Builder.class);
        }

        private int bitField0_;
        public static final int METAINFORMATION_FIELD_NUMBER = 1;
        private MetaInformation metaInformation_;
        /**
         * <pre>
         * The shared meta information.
         * </pre>
         *
         * <code>optional .model.traffic.MetaInformation metaInformation = 1;</code>
         */
        public boolean hasMetaInformation() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <pre>
         * The shared meta information.
         * </pre>
         *
         * <code>optional .model.traffic.MetaInformation metaInformation = 1;</code>
         */
        public MetaInformation getMetaInformation() {
            return metaInformation_ == null ? MetaInformation.getDefaultInstance() : metaInformation_;
        }
        /**
         * <pre>
         * The shared meta information.
         * </pre>
         *
         * <code>optional .model.traffic.MetaInformation metaInformation = 1;</code>
         */
        public MetaInformationOrBuilder getMetaInformationOrBuilder() {
            return metaInformation_ == null ? MetaInformation.getDefaultInstance() : metaInformation_;
        }

        public static final int TRAFFICFLOW_FIELD_NUMBER = 2;
        private java.util.List<TrafficFlow> trafficFlow_;
        /**
         * <pre>
         * The list of traffic flow elements.
         * </pre>
         *
         * <code>repeated .model.traffic.TrafficFlow trafficFlow = 2;</code>
         */
        public java.util.List<TrafficFlow> getTrafficFlowList() {
            return trafficFlow_;
        }
        /**
         * <pre>
         * The list of traffic flow elements.
         * </pre>
         *
         * <code>repeated .model.traffic.TrafficFlow trafficFlow = 2;</code>
         */
        public java.util.List<? extends TrafficFlowOrBuilder>
        getTrafficFlowOrBuilderList() {
            return trafficFlow_;
        }
        /**
         * <pre>
         * The list of traffic flow elements.
         * </pre>
         *
         * <code>repeated .model.traffic.TrafficFlow trafficFlow = 2;</code>
         */
        public int getTrafficFlowCount() {
            return trafficFlow_.size();
        }
        /**
         * <pre>
         * The list of traffic flow elements.
         * </pre>
         *
         * <code>repeated .model.traffic.TrafficFlow trafficFlow = 2;</code>
         */
        public TrafficFlow getTrafficFlow(int index) {
            return trafficFlow_.get(index);
        }
        /**
         * <pre>
         * The list of traffic flow elements.
         * </pre>
         *
         * <code>repeated .model.traffic.TrafficFlow trafficFlow = 2;</code>
         */
        public TrafficFlowOrBuilder getTrafficFlowOrBuilder(
                int index) {
            return trafficFlow_.get(index);
        }

        public static final int TRAFFICFLOWWITHPREDICTION_FIELD_NUMBER = 3;
        private java.util.List<TrafficFlowWithPrediction> trafficFlowWithPrediction_;
        /**
         * <pre>
         * The list of traffic flow elements which can also provide predictive flow data.
         * </pre>
         *
         * <code>repeated .model.traffic.TrafficFlowWithPrediction trafficFlowWithPrediction = 3;</code>
         */
        public java.util.List<TrafficFlowWithPrediction> getTrafficFlowWithPredictionList() {
            return trafficFlowWithPrediction_;
        }
        /**
         * <pre>
         * The list of traffic flow elements which can also provide predictive flow data.
         * </pre>
         *
         * <code>repeated .model.traffic.TrafficFlowWithPrediction trafficFlowWithPrediction = 3;</code>
         */
        public java.util.List<? extends TrafficFlowWithPredictionOrBuilder>
        getTrafficFlowWithPredictionOrBuilderList() {
            return trafficFlowWithPrediction_;
        }
        /**
         * <pre>
         * The list of traffic flow elements which can also provide predictive flow data.
         * </pre>
         *
         * <code>repeated .model.traffic.TrafficFlowWithPrediction trafficFlowWithPrediction = 3;</code>
         */
        public int getTrafficFlowWithPredictionCount() {
            return trafficFlowWithPrediction_.size();
        }
        /**
         * <pre>
         * The list of traffic flow elements which can also provide predictive flow data.
         * </pre>
         *
         * <code>repeated .model.traffic.TrafficFlowWithPrediction trafficFlowWithPrediction = 3;</code>
         */
        public TrafficFlowWithPrediction getTrafficFlowWithPrediction(int index) {
            return trafficFlowWithPrediction_.get(index);
        }
        /**
         * <pre>
         * The list of traffic flow elements which can also provide predictive flow data.
         * </pre>
         *
         * <code>repeated .model.traffic.TrafficFlowWithPrediction trafficFlowWithPrediction = 3;</code>
         */
        public TrafficFlowWithPredictionOrBuilder getTrafficFlowWithPredictionOrBuilder(
                int index) {
            return trafficFlowWithPrediction_.get(index);
        }

        public static final int TRAFFICFLOWWITHPREDICTIONPERSECTION_FIELD_NUMBER = 4;
        private java.util.List<TrafficFlowWithPredictionPerSection> trafficFlowWithPredictionPerSection_;
        /**
         * <pre>
         * The list of traffic flow elements with a higher spatial resolution for speeds
         * and predictive flow data.
         * </pre>
         *
         * <code>repeated .model.traffic.TrafficFlowWithPredictionPerSection trafficFlowWithPredictionPerSection = 4;</code>
         */
        public java.util.List<TrafficFlowWithPredictionPerSection> getTrafficFlowWithPredictionPerSectionList() {
            return trafficFlowWithPredictionPerSection_;
        }
        /**
         * <pre>
         * The list of traffic flow elements with a higher spatial resolution for speeds
         * and predictive flow data.
         * </pre>
         *
         * <code>repeated .model.traffic.TrafficFlowWithPredictionPerSection trafficFlowWithPredictionPerSection = 4;</code>
         */
        public java.util.List<? extends TrafficFlowWithPredictionPerSectionOrBuilder>
        getTrafficFlowWithPredictionPerSectionOrBuilderList() {
            return trafficFlowWithPredictionPerSection_;
        }
        /**
         * <pre>
         * The list of traffic flow elements with a higher spatial resolution for speeds
         * and predictive flow data.
         * </pre>
         *
         * <code>repeated .model.traffic.TrafficFlowWithPredictionPerSection trafficFlowWithPredictionPerSection = 4;</code>
         */
        public int getTrafficFlowWithPredictionPerSectionCount() {
            return trafficFlowWithPredictionPerSection_.size();
        }
        /**
         * <pre>
         * The list of traffic flow elements with a higher spatial resolution for speeds
         * and predictive flow data.
         * </pre>
         *
         * <code>repeated .model.traffic.TrafficFlowWithPredictionPerSection trafficFlowWithPredictionPerSection = 4;</code>
         */
        public TrafficFlowWithPredictionPerSection getTrafficFlowWithPredictionPerSection(int index) {
            return trafficFlowWithPredictionPerSection_.get(index);
        }
        /**
         * <pre>
         * The list of traffic flow elements with a higher spatial resolution for speeds
         * and predictive flow data.
         * </pre>
         *
         * <code>repeated .model.traffic.TrafficFlowWithPredictionPerSection trafficFlowWithPredictionPerSection = 4;</code>
         */
        public TrafficFlowWithPredictionPerSectionOrBuilder getTrafficFlowWithPredictionPerSectionOrBuilder(
                int index) {
            return trafficFlowWithPredictionPerSection_.get(index);
        }

        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeMessage(1, getMetaInformation());
            }
            for (int i = 0; i < trafficFlow_.size(); i++) {
                output.writeMessage(2, trafficFlow_.get(i));
            }
            for (int i = 0; i < trafficFlowWithPrediction_.size(); i++) {
                output.writeMessage(3, trafficFlowWithPrediction_.get(i));
            }
            for (int i = 0; i < trafficFlowWithPredictionPerSection_.size(); i++) {
                output.writeMessage(4, trafficFlowWithPredictionPerSection_.get(i));
            }
            unknownFields.writeTo(output);
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(1, getMetaInformation());
            }
            for (int i = 0; i < trafficFlow_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(2, trafficFlow_.get(i));
            }
            for (int i = 0; i < trafficFlowWithPrediction_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(3, trafficFlowWithPrediction_.get(i));
            }
            for (int i = 0; i < trafficFlowWithPredictionPerSection_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(4, trafficFlowWithPredictionPerSection_.get(i));
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TrafficFlowGroup)) {
                return super.equals(obj);
            }
            TrafficFlowGroup other = (TrafficFlowGroup) obj;

            boolean result = true;
            result = result && (hasMetaInformation() == other.hasMetaInformation());
            if (hasMetaInformation()) {
                result = result && getMetaInformation()
                        .equals(other.getMetaInformation());
            }
            result = result && getTrafficFlowList()
                    .equals(other.getTrafficFlowList());
            result = result && getTrafficFlowWithPredictionList()
                    .equals(other.getTrafficFlowWithPredictionList());
            result = result && getTrafficFlowWithPredictionPerSectionList()
                    .equals(other.getTrafficFlowWithPredictionPerSectionList());
            result = result && unknownFields.equals(other.unknownFields);
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (hasMetaInformation()) {
                hash = (37 * hash) + METAINFORMATION_FIELD_NUMBER;
                hash = (53 * hash) + getMetaInformation().hashCode();
            }
            if (getTrafficFlowCount() > 0) {
                hash = (37 * hash) + TRAFFICFLOW_FIELD_NUMBER;
                hash = (53 * hash) + getTrafficFlowList().hashCode();
            }
            if (getTrafficFlowWithPredictionCount() > 0) {
                hash = (37 * hash) + TRAFFICFLOWWITHPREDICTION_FIELD_NUMBER;
                hash = (53 * hash) + getTrafficFlowWithPredictionList().hashCode();
            }
            if (getTrafficFlowWithPredictionPerSectionCount() > 0) {
                hash = (37 * hash) + TRAFFICFLOWWITHPREDICTIONPERSECTION_FIELD_NUMBER;
                hash = (53 * hash) + getTrafficFlowWithPredictionPerSectionList().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static TrafficFlowGroup parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static TrafficFlowGroup parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static TrafficFlowGroup parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static TrafficFlowGroup parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static TrafficFlowGroup parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static TrafficFlowGroup parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static TrafficFlowGroup parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static TrafficFlowGroup parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static TrafficFlowGroup parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static TrafficFlowGroup parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static TrafficFlowGroup parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static TrafficFlowGroup parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(TrafficFlowGroup prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(
                BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * <pre>
         * The traffic flow group is the top level message. It provides meta data
         * covering general information about the flow data and the flow data itself.
         * </pre>
         *
         * Protobuf type {@code model.traffic.TrafficFlowGroup}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:model.traffic.TrafficFlowGroup)
                TrafficFlowGroupOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ProtobufTrafficFlowV5.internal_static_model_traffic_TrafficFlowGroup_descriptor;
            }

            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ProtobufTrafficFlowV5.internal_static_model_traffic_TrafficFlowGroup_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                TrafficFlowGroup.class, Builder.class);
            }

            // Construct using model.traffic.ProtobufTrafficFlowV5.TrafficFlowGroup.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                    getMetaInformationFieldBuilder();
                    getTrafficFlowFieldBuilder();
                    getTrafficFlowWithPredictionFieldBuilder();
                    getTrafficFlowWithPredictionPerSectionFieldBuilder();
                }
            }
            public Builder clear() {
                super.clear();
                if (metaInformationBuilder_ == null) {
                    metaInformation_ = null;
                } else {
                    metaInformationBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000001);
                if (trafficFlowBuilder_ == null) {
                    trafficFlow_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000002);
                } else {
                    trafficFlowBuilder_.clear();
                }
                if (trafficFlowWithPredictionBuilder_ == null) {
                    trafficFlowWithPrediction_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000004);
                } else {
                    trafficFlowWithPredictionBuilder_.clear();
                }
                if (trafficFlowWithPredictionPerSectionBuilder_ == null) {
                    trafficFlowWithPredictionPerSection_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000008);
                } else {
                    trafficFlowWithPredictionPerSectionBuilder_.clear();
                }
                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return ProtobufTrafficFlowV5.internal_static_model_traffic_TrafficFlowGroup_descriptor;
            }

            public TrafficFlowGroup getDefaultInstanceForType() {
                return TrafficFlowGroup.getDefaultInstance();
            }

            public TrafficFlowGroup build() {
                TrafficFlowGroup result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public TrafficFlowGroup buildPartial() {
                TrafficFlowGroup result = new TrafficFlowGroup(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                if (metaInformationBuilder_ == null) {
                    result.metaInformation_ = metaInformation_;
                } else {
                    result.metaInformation_ = metaInformationBuilder_.build();
                }
                if (trafficFlowBuilder_ == null) {
                    if (((bitField0_ & 0x00000002) == 0x00000002)) {
                        trafficFlow_ = java.util.Collections.unmodifiableList(trafficFlow_);
                        bitField0_ = (bitField0_ & ~0x00000002);
                    }
                    result.trafficFlow_ = trafficFlow_;
                } else {
                    result.trafficFlow_ = trafficFlowBuilder_.build();
                }
                if (trafficFlowWithPredictionBuilder_ == null) {
                    if (((bitField0_ & 0x00000004) == 0x00000004)) {
                        trafficFlowWithPrediction_ = java.util.Collections.unmodifiableList(trafficFlowWithPrediction_);
                        bitField0_ = (bitField0_ & ~0x00000004);
                    }
                    result.trafficFlowWithPrediction_ = trafficFlowWithPrediction_;
                } else {
                    result.trafficFlowWithPrediction_ = trafficFlowWithPredictionBuilder_.build();
                }
                if (trafficFlowWithPredictionPerSectionBuilder_ == null) {
                    if (((bitField0_ & 0x00000008) == 0x00000008)) {
                        trafficFlowWithPredictionPerSection_ = java.util.Collections.unmodifiableList(trafficFlowWithPredictionPerSection_);
                        bitField0_ = (bitField0_ & ~0x00000008);
                    }
                    result.trafficFlowWithPredictionPerSection_ = trafficFlowWithPredictionPerSection_;
                } else {
                    result.trafficFlowWithPredictionPerSection_ = trafficFlowWithPredictionPerSectionBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof TrafficFlowGroup) {
                    return mergeFrom((TrafficFlowGroup)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(TrafficFlowGroup other) {
                if (other == TrafficFlowGroup.getDefaultInstance()) return this;
                if (other.hasMetaInformation()) {
                    mergeMetaInformation(other.getMetaInformation());
                }
                if (trafficFlowBuilder_ == null) {
                    if (!other.trafficFlow_.isEmpty()) {
                        if (trafficFlow_.isEmpty()) {
                            trafficFlow_ = other.trafficFlow_;
                            bitField0_ = (bitField0_ & ~0x00000002);
                        } else {
                            ensureTrafficFlowIsMutable();
                            trafficFlow_.addAll(other.trafficFlow_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.trafficFlow_.isEmpty()) {
                        if (trafficFlowBuilder_.isEmpty()) {
                            trafficFlowBuilder_.dispose();
                            trafficFlowBuilder_ = null;
                            trafficFlow_ = other.trafficFlow_;
                            bitField0_ = (bitField0_ & ~0x00000002);
                            trafficFlowBuilder_ =
                                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                            getTrafficFlowFieldBuilder() : null;
                        } else {
                            trafficFlowBuilder_.addAllMessages(other.trafficFlow_);
                        }
                    }
                }
                if (trafficFlowWithPredictionBuilder_ == null) {
                    if (!other.trafficFlowWithPrediction_.isEmpty()) {
                        if (trafficFlowWithPrediction_.isEmpty()) {
                            trafficFlowWithPrediction_ = other.trafficFlowWithPrediction_;
                            bitField0_ = (bitField0_ & ~0x00000004);
                        } else {
                            ensureTrafficFlowWithPredictionIsMutable();
                            trafficFlowWithPrediction_.addAll(other.trafficFlowWithPrediction_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.trafficFlowWithPrediction_.isEmpty()) {
                        if (trafficFlowWithPredictionBuilder_.isEmpty()) {
                            trafficFlowWithPredictionBuilder_.dispose();
                            trafficFlowWithPredictionBuilder_ = null;
                            trafficFlowWithPrediction_ = other.trafficFlowWithPrediction_;
                            bitField0_ = (bitField0_ & ~0x00000004);
                            trafficFlowWithPredictionBuilder_ =
                                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                            getTrafficFlowWithPredictionFieldBuilder() : null;
                        } else {
                            trafficFlowWithPredictionBuilder_.addAllMessages(other.trafficFlowWithPrediction_);
                        }
                    }
                }
                if (trafficFlowWithPredictionPerSectionBuilder_ == null) {
                    if (!other.trafficFlowWithPredictionPerSection_.isEmpty()) {
                        if (trafficFlowWithPredictionPerSection_.isEmpty()) {
                            trafficFlowWithPredictionPerSection_ = other.trafficFlowWithPredictionPerSection_;
                            bitField0_ = (bitField0_ & ~0x00000008);
                        } else {
                            ensureTrafficFlowWithPredictionPerSectionIsMutable();
                            trafficFlowWithPredictionPerSection_.addAll(other.trafficFlowWithPredictionPerSection_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.trafficFlowWithPredictionPerSection_.isEmpty()) {
                        if (trafficFlowWithPredictionPerSectionBuilder_.isEmpty()) {
                            trafficFlowWithPredictionPerSectionBuilder_.dispose();
                            trafficFlowWithPredictionPerSectionBuilder_ = null;
                            trafficFlowWithPredictionPerSection_ = other.trafficFlowWithPredictionPerSection_;
                            bitField0_ = (bitField0_ & ~0x00000008);
                            trafficFlowWithPredictionPerSectionBuilder_ =
                                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                            getTrafficFlowWithPredictionPerSectionFieldBuilder() : null;
                        } else {
                            trafficFlowWithPredictionPerSectionBuilder_.addAllMessages(other.trafficFlowWithPredictionPerSection_);
                        }
                    }
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                TrafficFlowGroup parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (TrafficFlowGroup) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            private MetaInformation metaInformation_ = null;
            private com.google.protobuf.SingleFieldBuilderV3<
                    MetaInformation, MetaInformation.Builder, MetaInformationOrBuilder> metaInformationBuilder_;
            /**
             * <pre>
             * The shared meta information.
             * </pre>
             *
             * <code>optional .model.traffic.MetaInformation metaInformation = 1;</code>
             */
            public boolean hasMetaInformation() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <pre>
             * The shared meta information.
             * </pre>
             *
             * <code>optional .model.traffic.MetaInformation metaInformation = 1;</code>
             */
            public MetaInformation getMetaInformation() {
                if (metaInformationBuilder_ == null) {
                    return metaInformation_ == null ? MetaInformation.getDefaultInstance() : metaInformation_;
                } else {
                    return metaInformationBuilder_.getMessage();
                }
            }
            /**
             * <pre>
             * The shared meta information.
             * </pre>
             *
             * <code>optional .model.traffic.MetaInformation metaInformation = 1;</code>
             */
            public Builder setMetaInformation(MetaInformation value) {
                if (metaInformationBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    metaInformation_ = value;
                    onChanged();
                } else {
                    metaInformationBuilder_.setMessage(value);
                }
                bitField0_ |= 0x00000001;
                return this;
            }
            /**
             * <pre>
             * The shared meta information.
             * </pre>
             *
             * <code>optional .model.traffic.MetaInformation metaInformation = 1;</code>
             */
            public Builder setMetaInformation(
                    MetaInformation.Builder builderForValue) {
                if (metaInformationBuilder_ == null) {
                    metaInformation_ = builderForValue.build();
                    onChanged();
                } else {
                    metaInformationBuilder_.setMessage(builderForValue.build());
                }
                bitField0_ |= 0x00000001;
                return this;
            }
            /**
             * <pre>
             * The shared meta information.
             * </pre>
             *
             * <code>optional .model.traffic.MetaInformation metaInformation = 1;</code>
             */
            public Builder mergeMetaInformation(MetaInformation value) {
                if (metaInformationBuilder_ == null) {
                    if (((bitField0_ & 0x00000001) == 0x00000001) &&
                            metaInformation_ != null &&
                            metaInformation_ != MetaInformation.getDefaultInstance()) {
                        metaInformation_ =
                                MetaInformation.newBuilder(metaInformation_).mergeFrom(value).buildPartial();
                    } else {
                        metaInformation_ = value;
                    }
                    onChanged();
                } else {
                    metaInformationBuilder_.mergeFrom(value);
                }
                bitField0_ |= 0x00000001;
                return this;
            }
            /**
             * <pre>
             * The shared meta information.
             * </pre>
             *
             * <code>optional .model.traffic.MetaInformation metaInformation = 1;</code>
             */
            public Builder clearMetaInformation() {
                if (metaInformationBuilder_ == null) {
                    metaInformation_ = null;
                    onChanged();
                } else {
                    metaInformationBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000001);
                return this;
            }
            /**
             * <pre>
             * The shared meta information.
             * </pre>
             *
             * <code>optional .model.traffic.MetaInformation metaInformation = 1;</code>
             */
            public MetaInformation.Builder getMetaInformationBuilder() {
                bitField0_ |= 0x00000001;
                onChanged();
                return getMetaInformationFieldBuilder().getBuilder();
            }
            /**
             * <pre>
             * The shared meta information.
             * </pre>
             *
             * <code>optional .model.traffic.MetaInformation metaInformation = 1;</code>
             */
            public MetaInformationOrBuilder getMetaInformationOrBuilder() {
                if (metaInformationBuilder_ != null) {
                    return metaInformationBuilder_.getMessageOrBuilder();
                } else {
                    return metaInformation_ == null ?
                            MetaInformation.getDefaultInstance() : metaInformation_;
                }
            }
            /**
             * <pre>
             * The shared meta information.
             * </pre>
             *
             * <code>optional .model.traffic.MetaInformation metaInformation = 1;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    MetaInformation, MetaInformation.Builder, MetaInformationOrBuilder>
            getMetaInformationFieldBuilder() {
                if (metaInformationBuilder_ == null) {
                    metaInformationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            MetaInformation, MetaInformation.Builder, MetaInformationOrBuilder>(
                            getMetaInformation(),
                            getParentForChildren(),
                            isClean());
                    metaInformation_ = null;
                }
                return metaInformationBuilder_;
            }

            private java.util.List<TrafficFlow> trafficFlow_ =
                    java.util.Collections.emptyList();
            private void ensureTrafficFlowIsMutable() {
                if (!((bitField0_ & 0x00000002) == 0x00000002)) {
                    trafficFlow_ = new java.util.ArrayList<TrafficFlow>(trafficFlow_);
                    bitField0_ |= 0x00000002;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    TrafficFlow, TrafficFlow.Builder, TrafficFlowOrBuilder> trafficFlowBuilder_;

            /**
             * <pre>
             * The list of traffic flow elements.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlow trafficFlow = 2;</code>
             */
            public java.util.List<TrafficFlow> getTrafficFlowList() {
                if (trafficFlowBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(trafficFlow_);
                } else {
                    return trafficFlowBuilder_.getMessageList();
                }
            }
            /**
             * <pre>
             * The list of traffic flow elements.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlow trafficFlow = 2;</code>
             */
            public int getTrafficFlowCount() {
                if (trafficFlowBuilder_ == null) {
                    return trafficFlow_.size();
                } else {
                    return trafficFlowBuilder_.getCount();
                }
            }
            /**
             * <pre>
             * The list of traffic flow elements.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlow trafficFlow = 2;</code>
             */
            public TrafficFlow getTrafficFlow(int index) {
                if (trafficFlowBuilder_ == null) {
                    return trafficFlow_.get(index);
                } else {
                    return trafficFlowBuilder_.getMessage(index);
                }
            }
            /**
             * <pre>
             * The list of traffic flow elements.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlow trafficFlow = 2;</code>
             */
            public Builder setTrafficFlow(
                    int index, TrafficFlow value) {
                if (trafficFlowBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureTrafficFlowIsMutable();
                    trafficFlow_.set(index, value);
                    onChanged();
                } else {
                    trafficFlowBuilder_.setMessage(index, value);
                }
                return this;
            }
            /**
             * <pre>
             * The list of traffic flow elements.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlow trafficFlow = 2;</code>
             */
            public Builder setTrafficFlow(
                    int index, TrafficFlow.Builder builderForValue) {
                if (trafficFlowBuilder_ == null) {
                    ensureTrafficFlowIsMutable();
                    trafficFlow_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    trafficFlowBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <pre>
             * The list of traffic flow elements.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlow trafficFlow = 2;</code>
             */
            public Builder addTrafficFlow(TrafficFlow value) {
                if (trafficFlowBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureTrafficFlowIsMutable();
                    trafficFlow_.add(value);
                    onChanged();
                } else {
                    trafficFlowBuilder_.addMessage(value);
                }
                return this;
            }
            /**
             * <pre>
             * The list of traffic flow elements.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlow trafficFlow = 2;</code>
             */
            public Builder addTrafficFlow(
                    int index, TrafficFlow value) {
                if (trafficFlowBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureTrafficFlowIsMutable();
                    trafficFlow_.add(index, value);
                    onChanged();
                } else {
                    trafficFlowBuilder_.addMessage(index, value);
                }
                return this;
            }
            /**
             * <pre>
             * The list of traffic flow elements.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlow trafficFlow = 2;</code>
             */
            public Builder addTrafficFlow(
                    TrafficFlow.Builder builderForValue) {
                if (trafficFlowBuilder_ == null) {
                    ensureTrafficFlowIsMutable();
                    trafficFlow_.add(builderForValue.build());
                    onChanged();
                } else {
                    trafficFlowBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            /**
             * <pre>
             * The list of traffic flow elements.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlow trafficFlow = 2;</code>
             */
            public Builder addTrafficFlow(
                    int index, TrafficFlow.Builder builderForValue) {
                if (trafficFlowBuilder_ == null) {
                    ensureTrafficFlowIsMutable();
                    trafficFlow_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    trafficFlowBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <pre>
             * The list of traffic flow elements.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlow trafficFlow = 2;</code>
             */
            public Builder addAllTrafficFlow(
                    Iterable<? extends TrafficFlow> values) {
                if (trafficFlowBuilder_ == null) {
                    ensureTrafficFlowIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(
                            values, trafficFlow_);
                    onChanged();
                } else {
                    trafficFlowBuilder_.addAllMessages(values);
                }
                return this;
            }
            /**
             * <pre>
             * The list of traffic flow elements.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlow trafficFlow = 2;</code>
             */
            public Builder clearTrafficFlow() {
                if (trafficFlowBuilder_ == null) {
                    trafficFlow_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000002);
                    onChanged();
                } else {
                    trafficFlowBuilder_.clear();
                }
                return this;
            }
            /**
             * <pre>
             * The list of traffic flow elements.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlow trafficFlow = 2;</code>
             */
            public Builder removeTrafficFlow(int index) {
                if (trafficFlowBuilder_ == null) {
                    ensureTrafficFlowIsMutable();
                    trafficFlow_.remove(index);
                    onChanged();
                } else {
                    trafficFlowBuilder_.remove(index);
                }
                return this;
            }
            /**
             * <pre>
             * The list of traffic flow elements.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlow trafficFlow = 2;</code>
             */
            public TrafficFlow.Builder getTrafficFlowBuilder(
                    int index) {
                return getTrafficFlowFieldBuilder().getBuilder(index);
            }
            /**
             * <pre>
             * The list of traffic flow elements.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlow trafficFlow = 2;</code>
             */
            public TrafficFlowOrBuilder getTrafficFlowOrBuilder(
                    int index) {
                if (trafficFlowBuilder_ == null) {
                    return trafficFlow_.get(index);  } else {
                    return trafficFlowBuilder_.getMessageOrBuilder(index);
                }
            }
            /**
             * <pre>
             * The list of traffic flow elements.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlow trafficFlow = 2;</code>
             */
            public java.util.List<? extends TrafficFlowOrBuilder>
            getTrafficFlowOrBuilderList() {
                if (trafficFlowBuilder_ != null) {
                    return trafficFlowBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(trafficFlow_);
                }
            }
            /**
             * <pre>
             * The list of traffic flow elements.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlow trafficFlow = 2;</code>
             */
            public TrafficFlow.Builder addTrafficFlowBuilder() {
                return getTrafficFlowFieldBuilder().addBuilder(
                        TrafficFlow.getDefaultInstance());
            }
            /**
             * <pre>
             * The list of traffic flow elements.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlow trafficFlow = 2;</code>
             */
            public TrafficFlow.Builder addTrafficFlowBuilder(
                    int index) {
                return getTrafficFlowFieldBuilder().addBuilder(
                        index, TrafficFlow.getDefaultInstance());
            }
            /**
             * <pre>
             * The list of traffic flow elements.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlow trafficFlow = 2;</code>
             */
            public java.util.List<TrafficFlow.Builder>
            getTrafficFlowBuilderList() {
                return getTrafficFlowFieldBuilder().getBuilderList();
            }
            private com.google.protobuf.RepeatedFieldBuilderV3<
                    TrafficFlow, TrafficFlow.Builder, TrafficFlowOrBuilder>
            getTrafficFlowFieldBuilder() {
                if (trafficFlowBuilder_ == null) {
                    trafficFlowBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                            TrafficFlow, TrafficFlow.Builder, TrafficFlowOrBuilder>(
                            trafficFlow_,
                            ((bitField0_ & 0x00000002) == 0x00000002),
                            getParentForChildren(),
                            isClean());
                    trafficFlow_ = null;
                }
                return trafficFlowBuilder_;
            }

            private java.util.List<TrafficFlowWithPrediction> trafficFlowWithPrediction_ =
                    java.util.Collections.emptyList();
            private void ensureTrafficFlowWithPredictionIsMutable() {
                if (!((bitField0_ & 0x00000004) == 0x00000004)) {
                    trafficFlowWithPrediction_ = new java.util.ArrayList<TrafficFlowWithPrediction>(trafficFlowWithPrediction_);
                    bitField0_ |= 0x00000004;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    TrafficFlowWithPrediction, TrafficFlowWithPrediction.Builder, TrafficFlowWithPredictionOrBuilder> trafficFlowWithPredictionBuilder_;

            /**
             * <pre>
             * The list of traffic flow elements which can also provide predictive flow data.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlowWithPrediction trafficFlowWithPrediction = 3;</code>
             */
            public java.util.List<TrafficFlowWithPrediction> getTrafficFlowWithPredictionList() {
                if (trafficFlowWithPredictionBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(trafficFlowWithPrediction_);
                } else {
                    return trafficFlowWithPredictionBuilder_.getMessageList();
                }
            }
            /**
             * <pre>
             * The list of traffic flow elements which can also provide predictive flow data.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlowWithPrediction trafficFlowWithPrediction = 3;</code>
             */
            public int getTrafficFlowWithPredictionCount() {
                if (trafficFlowWithPredictionBuilder_ == null) {
                    return trafficFlowWithPrediction_.size();
                } else {
                    return trafficFlowWithPredictionBuilder_.getCount();
                }
            }
            /**
             * <pre>
             * The list of traffic flow elements which can also provide predictive flow data.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlowWithPrediction trafficFlowWithPrediction = 3;</code>
             */
            public TrafficFlowWithPrediction getTrafficFlowWithPrediction(int index) {
                if (trafficFlowWithPredictionBuilder_ == null) {
                    return trafficFlowWithPrediction_.get(index);
                } else {
                    return trafficFlowWithPredictionBuilder_.getMessage(index);
                }
            }
            /**
             * <pre>
             * The list of traffic flow elements which can also provide predictive flow data.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlowWithPrediction trafficFlowWithPrediction = 3;</code>
             */
            public Builder setTrafficFlowWithPrediction(
                    int index, TrafficFlowWithPrediction value) {
                if (trafficFlowWithPredictionBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureTrafficFlowWithPredictionIsMutable();
                    trafficFlowWithPrediction_.set(index, value);
                    onChanged();
                } else {
                    trafficFlowWithPredictionBuilder_.setMessage(index, value);
                }
                return this;
            }
            /**
             * <pre>
             * The list of traffic flow elements which can also provide predictive flow data.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlowWithPrediction trafficFlowWithPrediction = 3;</code>
             */
            public Builder setTrafficFlowWithPrediction(
                    int index, TrafficFlowWithPrediction.Builder builderForValue) {
                if (trafficFlowWithPredictionBuilder_ == null) {
                    ensureTrafficFlowWithPredictionIsMutable();
                    trafficFlowWithPrediction_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    trafficFlowWithPredictionBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <pre>
             * The list of traffic flow elements which can also provide predictive flow data.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlowWithPrediction trafficFlowWithPrediction = 3;</code>
             */
            public Builder addTrafficFlowWithPrediction(TrafficFlowWithPrediction value) {
                if (trafficFlowWithPredictionBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureTrafficFlowWithPredictionIsMutable();
                    trafficFlowWithPrediction_.add(value);
                    onChanged();
                } else {
                    trafficFlowWithPredictionBuilder_.addMessage(value);
                }
                return this;
            }
            /**
             * <pre>
             * The list of traffic flow elements which can also provide predictive flow data.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlowWithPrediction trafficFlowWithPrediction = 3;</code>
             */
            public Builder addTrafficFlowWithPrediction(
                    int index, TrafficFlowWithPrediction value) {
                if (trafficFlowWithPredictionBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureTrafficFlowWithPredictionIsMutable();
                    trafficFlowWithPrediction_.add(index, value);
                    onChanged();
                } else {
                    trafficFlowWithPredictionBuilder_.addMessage(index, value);
                }
                return this;
            }
            /**
             * <pre>
             * The list of traffic flow elements which can also provide predictive flow data.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlowWithPrediction trafficFlowWithPrediction = 3;</code>
             */
            public Builder addTrafficFlowWithPrediction(
                    TrafficFlowWithPrediction.Builder builderForValue) {
                if (trafficFlowWithPredictionBuilder_ == null) {
                    ensureTrafficFlowWithPredictionIsMutable();
                    trafficFlowWithPrediction_.add(builderForValue.build());
                    onChanged();
                } else {
                    trafficFlowWithPredictionBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            /**
             * <pre>
             * The list of traffic flow elements which can also provide predictive flow data.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlowWithPrediction trafficFlowWithPrediction = 3;</code>
             */
            public Builder addTrafficFlowWithPrediction(
                    int index, TrafficFlowWithPrediction.Builder builderForValue) {
                if (trafficFlowWithPredictionBuilder_ == null) {
                    ensureTrafficFlowWithPredictionIsMutable();
                    trafficFlowWithPrediction_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    trafficFlowWithPredictionBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <pre>
             * The list of traffic flow elements which can also provide predictive flow data.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlowWithPrediction trafficFlowWithPrediction = 3;</code>
             */
            public Builder addAllTrafficFlowWithPrediction(
                    Iterable<? extends TrafficFlowWithPrediction> values) {
                if (trafficFlowWithPredictionBuilder_ == null) {
                    ensureTrafficFlowWithPredictionIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(
                            values, trafficFlowWithPrediction_);
                    onChanged();
                } else {
                    trafficFlowWithPredictionBuilder_.addAllMessages(values);
                }
                return this;
            }
            /**
             * <pre>
             * The list of traffic flow elements which can also provide predictive flow data.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlowWithPrediction trafficFlowWithPrediction = 3;</code>
             */
            public Builder clearTrafficFlowWithPrediction() {
                if (trafficFlowWithPredictionBuilder_ == null) {
                    trafficFlowWithPrediction_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000004);
                    onChanged();
                } else {
                    trafficFlowWithPredictionBuilder_.clear();
                }
                return this;
            }
            /**
             * <pre>
             * The list of traffic flow elements which can also provide predictive flow data.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlowWithPrediction trafficFlowWithPrediction = 3;</code>
             */
            public Builder removeTrafficFlowWithPrediction(int index) {
                if (trafficFlowWithPredictionBuilder_ == null) {
                    ensureTrafficFlowWithPredictionIsMutable();
                    trafficFlowWithPrediction_.remove(index);
                    onChanged();
                } else {
                    trafficFlowWithPredictionBuilder_.remove(index);
                }
                return this;
            }
            /**
             * <pre>
             * The list of traffic flow elements which can also provide predictive flow data.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlowWithPrediction trafficFlowWithPrediction = 3;</code>
             */
            public TrafficFlowWithPrediction.Builder getTrafficFlowWithPredictionBuilder(
                    int index) {
                return getTrafficFlowWithPredictionFieldBuilder().getBuilder(index);
            }
            /**
             * <pre>
             * The list of traffic flow elements which can also provide predictive flow data.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlowWithPrediction trafficFlowWithPrediction = 3;</code>
             */
            public TrafficFlowWithPredictionOrBuilder getTrafficFlowWithPredictionOrBuilder(
                    int index) {
                if (trafficFlowWithPredictionBuilder_ == null) {
                    return trafficFlowWithPrediction_.get(index);  } else {
                    return trafficFlowWithPredictionBuilder_.getMessageOrBuilder(index);
                }
            }
            /**
             * <pre>
             * The list of traffic flow elements which can also provide predictive flow data.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlowWithPrediction trafficFlowWithPrediction = 3;</code>
             */
            public java.util.List<? extends TrafficFlowWithPredictionOrBuilder>
            getTrafficFlowWithPredictionOrBuilderList() {
                if (trafficFlowWithPredictionBuilder_ != null) {
                    return trafficFlowWithPredictionBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(trafficFlowWithPrediction_);
                }
            }
            /**
             * <pre>
             * The list of traffic flow elements which can also provide predictive flow data.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlowWithPrediction trafficFlowWithPrediction = 3;</code>
             */
            public TrafficFlowWithPrediction.Builder addTrafficFlowWithPredictionBuilder() {
                return getTrafficFlowWithPredictionFieldBuilder().addBuilder(
                        TrafficFlowWithPrediction.getDefaultInstance());
            }
            /**
             * <pre>
             * The list of traffic flow elements which can also provide predictive flow data.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlowWithPrediction trafficFlowWithPrediction = 3;</code>
             */
            public TrafficFlowWithPrediction.Builder addTrafficFlowWithPredictionBuilder(
                    int index) {
                return getTrafficFlowWithPredictionFieldBuilder().addBuilder(
                        index, TrafficFlowWithPrediction.getDefaultInstance());
            }
            /**
             * <pre>
             * The list of traffic flow elements which can also provide predictive flow data.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlowWithPrediction trafficFlowWithPrediction = 3;</code>
             */
            public java.util.List<TrafficFlowWithPrediction.Builder>
            getTrafficFlowWithPredictionBuilderList() {
                return getTrafficFlowWithPredictionFieldBuilder().getBuilderList();
            }
            private com.google.protobuf.RepeatedFieldBuilderV3<
                    TrafficFlowWithPrediction, TrafficFlowWithPrediction.Builder, TrafficFlowWithPredictionOrBuilder>
            getTrafficFlowWithPredictionFieldBuilder() {
                if (trafficFlowWithPredictionBuilder_ == null) {
                    trafficFlowWithPredictionBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                            TrafficFlowWithPrediction, TrafficFlowWithPrediction.Builder, TrafficFlowWithPredictionOrBuilder>(
                            trafficFlowWithPrediction_,
                            ((bitField0_ & 0x00000004) == 0x00000004),
                            getParentForChildren(),
                            isClean());
                    trafficFlowWithPrediction_ = null;
                }
                return trafficFlowWithPredictionBuilder_;
            }

            private java.util.List<TrafficFlowWithPredictionPerSection> trafficFlowWithPredictionPerSection_ =
                    java.util.Collections.emptyList();
            private void ensureTrafficFlowWithPredictionPerSectionIsMutable() {
                if (!((bitField0_ & 0x00000008) == 0x00000008)) {
                    trafficFlowWithPredictionPerSection_ = new java.util.ArrayList<TrafficFlowWithPredictionPerSection>(trafficFlowWithPredictionPerSection_);
                    bitField0_ |= 0x00000008;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    TrafficFlowWithPredictionPerSection, TrafficFlowWithPredictionPerSection.Builder, TrafficFlowWithPredictionPerSectionOrBuilder> trafficFlowWithPredictionPerSectionBuilder_;

            /**
             * <pre>
             * The list of traffic flow elements with a higher spatial resolution for speeds
             * and predictive flow data.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlowWithPredictionPerSection trafficFlowWithPredictionPerSection = 4;</code>
             */
            public java.util.List<TrafficFlowWithPredictionPerSection> getTrafficFlowWithPredictionPerSectionList() {
                if (trafficFlowWithPredictionPerSectionBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(trafficFlowWithPredictionPerSection_);
                } else {
                    return trafficFlowWithPredictionPerSectionBuilder_.getMessageList();
                }
            }
            /**
             * <pre>
             * The list of traffic flow elements with a higher spatial resolution for speeds
             * and predictive flow data.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlowWithPredictionPerSection trafficFlowWithPredictionPerSection = 4;</code>
             */
            public int getTrafficFlowWithPredictionPerSectionCount() {
                if (trafficFlowWithPredictionPerSectionBuilder_ == null) {
                    return trafficFlowWithPredictionPerSection_.size();
                } else {
                    return trafficFlowWithPredictionPerSectionBuilder_.getCount();
                }
            }
            /**
             * <pre>
             * The list of traffic flow elements with a higher spatial resolution for speeds
             * and predictive flow data.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlowWithPredictionPerSection trafficFlowWithPredictionPerSection = 4;</code>
             */
            public TrafficFlowWithPredictionPerSection getTrafficFlowWithPredictionPerSection(int index) {
                if (trafficFlowWithPredictionPerSectionBuilder_ == null) {
                    return trafficFlowWithPredictionPerSection_.get(index);
                } else {
                    return trafficFlowWithPredictionPerSectionBuilder_.getMessage(index);
                }
            }
            /**
             * <pre>
             * The list of traffic flow elements with a higher spatial resolution for speeds
             * and predictive flow data.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlowWithPredictionPerSection trafficFlowWithPredictionPerSection = 4;</code>
             */
            public Builder setTrafficFlowWithPredictionPerSection(
                    int index, TrafficFlowWithPredictionPerSection value) {
                if (trafficFlowWithPredictionPerSectionBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureTrafficFlowWithPredictionPerSectionIsMutable();
                    trafficFlowWithPredictionPerSection_.set(index, value);
                    onChanged();
                } else {
                    trafficFlowWithPredictionPerSectionBuilder_.setMessage(index, value);
                }
                return this;
            }
            /**
             * <pre>
             * The list of traffic flow elements with a higher spatial resolution for speeds
             * and predictive flow data.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlowWithPredictionPerSection trafficFlowWithPredictionPerSection = 4;</code>
             */
            public Builder setTrafficFlowWithPredictionPerSection(
                    int index, TrafficFlowWithPredictionPerSection.Builder builderForValue) {
                if (trafficFlowWithPredictionPerSectionBuilder_ == null) {
                    ensureTrafficFlowWithPredictionPerSectionIsMutable();
                    trafficFlowWithPredictionPerSection_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    trafficFlowWithPredictionPerSectionBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <pre>
             * The list of traffic flow elements with a higher spatial resolution for speeds
             * and predictive flow data.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlowWithPredictionPerSection trafficFlowWithPredictionPerSection = 4;</code>
             */
            public Builder addTrafficFlowWithPredictionPerSection(TrafficFlowWithPredictionPerSection value) {
                if (trafficFlowWithPredictionPerSectionBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureTrafficFlowWithPredictionPerSectionIsMutable();
                    trafficFlowWithPredictionPerSection_.add(value);
                    onChanged();
                } else {
                    trafficFlowWithPredictionPerSectionBuilder_.addMessage(value);
                }
                return this;
            }
            /**
             * <pre>
             * The list of traffic flow elements with a higher spatial resolution for speeds
             * and predictive flow data.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlowWithPredictionPerSection trafficFlowWithPredictionPerSection = 4;</code>
             */
            public Builder addTrafficFlowWithPredictionPerSection(
                    int index, TrafficFlowWithPredictionPerSection value) {
                if (trafficFlowWithPredictionPerSectionBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureTrafficFlowWithPredictionPerSectionIsMutable();
                    trafficFlowWithPredictionPerSection_.add(index, value);
                    onChanged();
                } else {
                    trafficFlowWithPredictionPerSectionBuilder_.addMessage(index, value);
                }
                return this;
            }
            /**
             * <pre>
             * The list of traffic flow elements with a higher spatial resolution for speeds
             * and predictive flow data.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlowWithPredictionPerSection trafficFlowWithPredictionPerSection = 4;</code>
             */
            public Builder addTrafficFlowWithPredictionPerSection(
                    TrafficFlowWithPredictionPerSection.Builder builderForValue) {
                if (trafficFlowWithPredictionPerSectionBuilder_ == null) {
                    ensureTrafficFlowWithPredictionPerSectionIsMutable();
                    trafficFlowWithPredictionPerSection_.add(builderForValue.build());
                    onChanged();
                } else {
                    trafficFlowWithPredictionPerSectionBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            /**
             * <pre>
             * The list of traffic flow elements with a higher spatial resolution for speeds
             * and predictive flow data.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlowWithPredictionPerSection trafficFlowWithPredictionPerSection = 4;</code>
             */
            public Builder addTrafficFlowWithPredictionPerSection(
                    int index, TrafficFlowWithPredictionPerSection.Builder builderForValue) {
                if (trafficFlowWithPredictionPerSectionBuilder_ == null) {
                    ensureTrafficFlowWithPredictionPerSectionIsMutable();
                    trafficFlowWithPredictionPerSection_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    trafficFlowWithPredictionPerSectionBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <pre>
             * The list of traffic flow elements with a higher spatial resolution for speeds
             * and predictive flow data.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlowWithPredictionPerSection trafficFlowWithPredictionPerSection = 4;</code>
             */
            public Builder addAllTrafficFlowWithPredictionPerSection(
                    Iterable<? extends TrafficFlowWithPredictionPerSection> values) {
                if (trafficFlowWithPredictionPerSectionBuilder_ == null) {
                    ensureTrafficFlowWithPredictionPerSectionIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(
                            values, trafficFlowWithPredictionPerSection_);
                    onChanged();
                } else {
                    trafficFlowWithPredictionPerSectionBuilder_.addAllMessages(values);
                }
                return this;
            }
            /**
             * <pre>
             * The list of traffic flow elements with a higher spatial resolution for speeds
             * and predictive flow data.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlowWithPredictionPerSection trafficFlowWithPredictionPerSection = 4;</code>
             */
            public Builder clearTrafficFlowWithPredictionPerSection() {
                if (trafficFlowWithPredictionPerSectionBuilder_ == null) {
                    trafficFlowWithPredictionPerSection_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000008);
                    onChanged();
                } else {
                    trafficFlowWithPredictionPerSectionBuilder_.clear();
                }
                return this;
            }
            /**
             * <pre>
             * The list of traffic flow elements with a higher spatial resolution for speeds
             * and predictive flow data.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlowWithPredictionPerSection trafficFlowWithPredictionPerSection = 4;</code>
             */
            public Builder removeTrafficFlowWithPredictionPerSection(int index) {
                if (trafficFlowWithPredictionPerSectionBuilder_ == null) {
                    ensureTrafficFlowWithPredictionPerSectionIsMutable();
                    trafficFlowWithPredictionPerSection_.remove(index);
                    onChanged();
                } else {
                    trafficFlowWithPredictionPerSectionBuilder_.remove(index);
                }
                return this;
            }
            /**
             * <pre>
             * The list of traffic flow elements with a higher spatial resolution for speeds
             * and predictive flow data.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlowWithPredictionPerSection trafficFlowWithPredictionPerSection = 4;</code>
             */
            public TrafficFlowWithPredictionPerSection.Builder getTrafficFlowWithPredictionPerSectionBuilder(
                    int index) {
                return getTrafficFlowWithPredictionPerSectionFieldBuilder().getBuilder(index);
            }
            /**
             * <pre>
             * The list of traffic flow elements with a higher spatial resolution for speeds
             * and predictive flow data.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlowWithPredictionPerSection trafficFlowWithPredictionPerSection = 4;</code>
             */
            public TrafficFlowWithPredictionPerSectionOrBuilder getTrafficFlowWithPredictionPerSectionOrBuilder(
                    int index) {
                if (trafficFlowWithPredictionPerSectionBuilder_ == null) {
                    return trafficFlowWithPredictionPerSection_.get(index);  } else {
                    return trafficFlowWithPredictionPerSectionBuilder_.getMessageOrBuilder(index);
                }
            }
            /**
             * <pre>
             * The list of traffic flow elements with a higher spatial resolution for speeds
             * and predictive flow data.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlowWithPredictionPerSection trafficFlowWithPredictionPerSection = 4;</code>
             */
            public java.util.List<? extends TrafficFlowWithPredictionPerSectionOrBuilder>
            getTrafficFlowWithPredictionPerSectionOrBuilderList() {
                if (trafficFlowWithPredictionPerSectionBuilder_ != null) {
                    return trafficFlowWithPredictionPerSectionBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(trafficFlowWithPredictionPerSection_);
                }
            }
            /**
             * <pre>
             * The list of traffic flow elements with a higher spatial resolution for speeds
             * and predictive flow data.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlowWithPredictionPerSection trafficFlowWithPredictionPerSection = 4;</code>
             */
            public TrafficFlowWithPredictionPerSection.Builder addTrafficFlowWithPredictionPerSectionBuilder() {
                return getTrafficFlowWithPredictionPerSectionFieldBuilder().addBuilder(
                        TrafficFlowWithPredictionPerSection.getDefaultInstance());
            }
            /**
             * <pre>
             * The list of traffic flow elements with a higher spatial resolution for speeds
             * and predictive flow data.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlowWithPredictionPerSection trafficFlowWithPredictionPerSection = 4;</code>
             */
            public TrafficFlowWithPredictionPerSection.Builder addTrafficFlowWithPredictionPerSectionBuilder(
                    int index) {
                return getTrafficFlowWithPredictionPerSectionFieldBuilder().addBuilder(
                        index, TrafficFlowWithPredictionPerSection.getDefaultInstance());
            }
            /**
             * <pre>
             * The list of traffic flow elements with a higher spatial resolution for speeds
             * and predictive flow data.
             * </pre>
             *
             * <code>repeated .model.traffic.TrafficFlowWithPredictionPerSection trafficFlowWithPredictionPerSection = 4;</code>
             */
            public java.util.List<TrafficFlowWithPredictionPerSection.Builder>
            getTrafficFlowWithPredictionPerSectionBuilderList() {
                return getTrafficFlowWithPredictionPerSectionFieldBuilder().getBuilderList();
            }
            private com.google.protobuf.RepeatedFieldBuilderV3<
                    TrafficFlowWithPredictionPerSection, TrafficFlowWithPredictionPerSection.Builder, TrafficFlowWithPredictionPerSectionOrBuilder>
            getTrafficFlowWithPredictionPerSectionFieldBuilder() {
                if (trafficFlowWithPredictionPerSectionBuilder_ == null) {
                    trafficFlowWithPredictionPerSectionBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                            TrafficFlowWithPredictionPerSection, TrafficFlowWithPredictionPerSection.Builder, TrafficFlowWithPredictionPerSectionOrBuilder>(
                            trafficFlowWithPredictionPerSection_,
                            ((bitField0_ & 0x00000008) == 0x00000008),
                            getParentForChildren(),
                            isClean());
                    trafficFlowWithPredictionPerSection_ = null;
                }
                return trafficFlowWithPredictionPerSectionBuilder_;
            }
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:model.traffic.TrafficFlowGroup)
        }

        // @@protoc_insertion_point(class_scope:model.traffic.TrafficFlowGroup)
        private static final TrafficFlowGroup DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new TrafficFlowGroup();
        }

        public static TrafficFlowGroup getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @Deprecated public static final com.google.protobuf.Parser<TrafficFlowGroup>
                PARSER = new com.google.protobuf.AbstractParser<TrafficFlowGroup>() {
            public TrafficFlowGroup parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new TrafficFlowGroup(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<TrafficFlowGroup> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<TrafficFlowGroup> getParserForType() {
            return PARSER;
        }

        public TrafficFlowGroup getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface MetaInformationOrBuilder extends
            // @@protoc_insertion_point(interface_extends:model.traffic.MetaInformation)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <pre>
         * Creation time (UTC) of the traffic flow group in seconds since
         * 00:00:00 UTC on 1 January 1970.
         * </pre>
         *
         * <code>optional uint32 createTimeUTCSeconds = 1;</code>
         */
        boolean hasCreateTimeUTCSeconds();
        /**
         * <pre>
         * Creation time (UTC) of the traffic flow group in seconds since
         * 00:00:00 UTC on 1 January 1970.
         * </pre>
         *
         * <code>optional uint32 createTimeUTCSeconds = 1;</code>
         */
        int getCreateTimeUTCSeconds();

        /**
         * <pre>
         * The supplier and client information.
         * </pre>
         *
         * <code>optional .model.traffic.SupplierAndClientInfo supplierAndClientInfo = 2;</code>
         */
        boolean hasSupplierAndClientInfo();
        /**
         * <pre>
         * The supplier and client information.
         * </pre>
         *
         * <code>optional .model.traffic.SupplierAndClientInfo supplierAndClientInfo = 2;</code>
         */
        SupplierAndClientInfo getSupplierAndClientInfo();
        /**
         * <pre>
         * The supplier and client information.
         * </pre>
         *
         * <code>optional .model.traffic.SupplierAndClientInfo supplierAndClientInfo = 2;</code>
         */
        SupplierAndClientInfoOrBuilder getSupplierAndClientInfoOrBuilder();

        /**
         * <pre>
         * The format version. Can be used for debugging in order to compare
         * the version of the protocol buffer on client and supplier side.
         * </pre>
         *
         * <code>optional int32 formatVersion = 3;</code>
         */
        boolean hasFormatVersion();
        /**
         * <pre>
         * The format version. Can be used for debugging in order to compare
         * the version of the protocol buffer on client and supplier side.
         * </pre>
         *
         * <code>optional int32 formatVersion = 3;</code>
         */
        int getFormatVersion();
    }
    /**
     * <pre>
     * The meta information message provides data shared by all
     * traffic flow messages.
     * </pre>
     *
     * Protobuf type {@code model.traffic.MetaInformation}
     */
    public  static final class MetaInformation extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:model.traffic.MetaInformation)
            MetaInformationOrBuilder {
        // Use MetaInformation.newBuilder() to construct.
        private MetaInformation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private MetaInformation() {
            createTimeUTCSeconds_ = 0;
            formatVersion_ = 0;
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private MetaInformation(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {
                            bitField0_ |= 0x00000001;
                            createTimeUTCSeconds_ = input.readUInt32();
                            break;
                        }
                        case 18: {
                            SupplierAndClientInfo.Builder subBuilder = null;
                            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                                subBuilder = supplierAndClientInfo_.toBuilder();
                            }
                            supplierAndClientInfo_ = input.readMessage(SupplierAndClientInfo.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(supplierAndClientInfo_);
                                supplierAndClientInfo_ = subBuilder.buildPartial();
                            }
                            bitField0_ |= 0x00000002;
                            break;
                        }
                        case 24: {
                            bitField0_ |= 0x00000004;
                            formatVersion_ = input.readInt32();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return ProtobufTrafficFlowV5.internal_static_model_traffic_MetaInformation_descriptor;
        }

        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return ProtobufTrafficFlowV5.internal_static_model_traffic_MetaInformation_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            MetaInformation.class, Builder.class);
        }

        private int bitField0_;
        public static final int CREATETIMEUTCSECONDS_FIELD_NUMBER = 1;
        private int createTimeUTCSeconds_;
        /**
         * <pre>
         * Creation time (UTC) of the traffic flow group in seconds since
         * 00:00:00 UTC on 1 January 1970.
         * </pre>
         *
         * <code>optional uint32 createTimeUTCSeconds = 1;</code>
         */
        public boolean hasCreateTimeUTCSeconds() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <pre>
         * Creation time (UTC) of the traffic flow group in seconds since
         * 00:00:00 UTC on 1 January 1970.
         * </pre>
         *
         * <code>optional uint32 createTimeUTCSeconds = 1;</code>
         */
        public int getCreateTimeUTCSeconds() {
            return createTimeUTCSeconds_;
        }

        public static final int SUPPLIERANDCLIENTINFO_FIELD_NUMBER = 2;
        private SupplierAndClientInfo supplierAndClientInfo_;
        /**
         * <pre>
         * The supplier and client information.
         * </pre>
         *
         * <code>optional .model.traffic.SupplierAndClientInfo supplierAndClientInfo = 2;</code>
         */
        public boolean hasSupplierAndClientInfo() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <pre>
         * The supplier and client information.
         * </pre>
         *
         * <code>optional .model.traffic.SupplierAndClientInfo supplierAndClientInfo = 2;</code>
         */
        public SupplierAndClientInfo getSupplierAndClientInfo() {
            return supplierAndClientInfo_ == null ? SupplierAndClientInfo.getDefaultInstance() : supplierAndClientInfo_;
        }
        /**
         * <pre>
         * The supplier and client information.
         * </pre>
         *
         * <code>optional .model.traffic.SupplierAndClientInfo supplierAndClientInfo = 2;</code>
         */
        public SupplierAndClientInfoOrBuilder getSupplierAndClientInfoOrBuilder() {
            return supplierAndClientInfo_ == null ? SupplierAndClientInfo.getDefaultInstance() : supplierAndClientInfo_;
        }

        public static final int FORMATVERSION_FIELD_NUMBER = 3;
        private int formatVersion_;
        /**
         * <pre>
         * The format version. Can be used for debugging in order to compare
         * the version of the protocol buffer on client and supplier side.
         * </pre>
         *
         * <code>optional int32 formatVersion = 3;</code>
         */
        public boolean hasFormatVersion() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <pre>
         * The format version. Can be used for debugging in order to compare
         * the version of the protocol buffer on client and supplier side.
         * </pre>
         *
         * <code>optional int32 formatVersion = 3;</code>
         */
        public int getFormatVersion() {
            return formatVersion_;
        }

        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeUInt32(1, createTimeUTCSeconds_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeMessage(2, getSupplierAndClientInfo());
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeInt32(3, formatVersion_);
            }
            unknownFields.writeTo(output);
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(1, createTimeUTCSeconds_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(2, getSupplierAndClientInfo());
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(3, formatVersion_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MetaInformation)) {
                return super.equals(obj);
            }
            MetaInformation other = (MetaInformation) obj;

            boolean result = true;
            result = result && (hasCreateTimeUTCSeconds() == other.hasCreateTimeUTCSeconds());
            if (hasCreateTimeUTCSeconds()) {
                result = result && (getCreateTimeUTCSeconds()
                        == other.getCreateTimeUTCSeconds());
            }
            result = result && (hasSupplierAndClientInfo() == other.hasSupplierAndClientInfo());
            if (hasSupplierAndClientInfo()) {
                result = result && getSupplierAndClientInfo()
                        .equals(other.getSupplierAndClientInfo());
            }
            result = result && (hasFormatVersion() == other.hasFormatVersion());
            if (hasFormatVersion()) {
                result = result && (getFormatVersion()
                        == other.getFormatVersion());
            }
            result = result && unknownFields.equals(other.unknownFields);
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (hasCreateTimeUTCSeconds()) {
                hash = (37 * hash) + CREATETIMEUTCSECONDS_FIELD_NUMBER;
                hash = (53 * hash) + getCreateTimeUTCSeconds();
            }
            if (hasSupplierAndClientInfo()) {
                hash = (37 * hash) + SUPPLIERANDCLIENTINFO_FIELD_NUMBER;
                hash = (53 * hash) + getSupplierAndClientInfo().hashCode();
            }
            if (hasFormatVersion()) {
                hash = (37 * hash) + FORMATVERSION_FIELD_NUMBER;
                hash = (53 * hash) + getFormatVersion();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static MetaInformation parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static MetaInformation parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static MetaInformation parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static MetaInformation parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static MetaInformation parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static MetaInformation parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static MetaInformation parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static MetaInformation parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static MetaInformation parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static MetaInformation parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static MetaInformation parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static MetaInformation parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(MetaInformation prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(
                BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * <pre>
         * The meta information message provides data shared by all
         * traffic flow messages.
         * </pre>
         *
         * Protobuf type {@code model.traffic.MetaInformation}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:model.traffic.MetaInformation)
                MetaInformationOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ProtobufTrafficFlowV5.internal_static_model_traffic_MetaInformation_descriptor;
            }

            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ProtobufTrafficFlowV5.internal_static_model_traffic_MetaInformation_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                MetaInformation.class, Builder.class);
            }

            // Construct using model.traffic.ProtobufTrafficFlowV5.MetaInformation.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                    getSupplierAndClientInfoFieldBuilder();
                }
            }
            public Builder clear() {
                super.clear();
                createTimeUTCSeconds_ = 0;
                bitField0_ = (bitField0_ & ~0x00000001);
                if (supplierAndClientInfoBuilder_ == null) {
                    supplierAndClientInfo_ = null;
                } else {
                    supplierAndClientInfoBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000002);
                formatVersion_ = 0;
                bitField0_ = (bitField0_ & ~0x00000004);
                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return ProtobufTrafficFlowV5.internal_static_model_traffic_MetaInformation_descriptor;
            }

            public MetaInformation getDefaultInstanceForType() {
                return MetaInformation.getDefaultInstance();
            }

            public MetaInformation build() {
                MetaInformation result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public MetaInformation buildPartial() {
                MetaInformation result = new MetaInformation(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.createTimeUTCSeconds_ = createTimeUTCSeconds_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                if (supplierAndClientInfoBuilder_ == null) {
                    result.supplierAndClientInfo_ = supplierAndClientInfo_;
                } else {
                    result.supplierAndClientInfo_ = supplierAndClientInfoBuilder_.build();
                }
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.formatVersion_ = formatVersion_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof MetaInformation) {
                    return mergeFrom((MetaInformation)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(MetaInformation other) {
                if (other == MetaInformation.getDefaultInstance()) return this;
                if (other.hasCreateTimeUTCSeconds()) {
                    setCreateTimeUTCSeconds(other.getCreateTimeUTCSeconds());
                }
                if (other.hasSupplierAndClientInfo()) {
                    mergeSupplierAndClientInfo(other.getSupplierAndClientInfo());
                }
                if (other.hasFormatVersion()) {
                    setFormatVersion(other.getFormatVersion());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                MetaInformation parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (MetaInformation) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            private int createTimeUTCSeconds_ ;
            /**
             * <pre>
             * Creation time (UTC) of the traffic flow group in seconds since
             * 00:00:00 UTC on 1 January 1970.
             * </pre>
             *
             * <code>optional uint32 createTimeUTCSeconds = 1;</code>
             */
            public boolean hasCreateTimeUTCSeconds() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <pre>
             * Creation time (UTC) of the traffic flow group in seconds since
             * 00:00:00 UTC on 1 January 1970.
             * </pre>
             *
             * <code>optional uint32 createTimeUTCSeconds = 1;</code>
             */
            public int getCreateTimeUTCSeconds() {
                return createTimeUTCSeconds_;
            }
            /**
             * <pre>
             * Creation time (UTC) of the traffic flow group in seconds since
             * 00:00:00 UTC on 1 January 1970.
             * </pre>
             *
             * <code>optional uint32 createTimeUTCSeconds = 1;</code>
             */
            public Builder setCreateTimeUTCSeconds(int value) {
                bitField0_ |= 0x00000001;
                createTimeUTCSeconds_ = value;
                onChanged();
                return this;
            }
            /**
             * <pre>
             * Creation time (UTC) of the traffic flow group in seconds since
             * 00:00:00 UTC on 1 January 1970.
             * </pre>
             *
             * <code>optional uint32 createTimeUTCSeconds = 1;</code>
             */
            public Builder clearCreateTimeUTCSeconds() {
                bitField0_ = (bitField0_ & ~0x00000001);
                createTimeUTCSeconds_ = 0;
                onChanged();
                return this;
            }

            private SupplierAndClientInfo supplierAndClientInfo_ = null;
            private com.google.protobuf.SingleFieldBuilderV3<
                    SupplierAndClientInfo, SupplierAndClientInfo.Builder, SupplierAndClientInfoOrBuilder> supplierAndClientInfoBuilder_;
            /**
             * <pre>
             * The supplier and client information.
             * </pre>
             *
             * <code>optional .model.traffic.SupplierAndClientInfo supplierAndClientInfo = 2;</code>
             */
            public boolean hasSupplierAndClientInfo() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <pre>
             * The supplier and client information.
             * </pre>
             *
             * <code>optional .model.traffic.SupplierAndClientInfo supplierAndClientInfo = 2;</code>
             */
            public SupplierAndClientInfo getSupplierAndClientInfo() {
                if (supplierAndClientInfoBuilder_ == null) {
                    return supplierAndClientInfo_ == null ? SupplierAndClientInfo.getDefaultInstance() : supplierAndClientInfo_;
                } else {
                    return supplierAndClientInfoBuilder_.getMessage();
                }
            }
            /**
             * <pre>
             * The supplier and client information.
             * </pre>
             *
             * <code>optional .model.traffic.SupplierAndClientInfo supplierAndClientInfo = 2;</code>
             */
            public Builder setSupplierAndClientInfo(SupplierAndClientInfo value) {
                if (supplierAndClientInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    supplierAndClientInfo_ = value;
                    onChanged();
                } else {
                    supplierAndClientInfoBuilder_.setMessage(value);
                }
                bitField0_ |= 0x00000002;
                return this;
            }
            /**
             * <pre>
             * The supplier and client information.
             * </pre>
             *
             * <code>optional .model.traffic.SupplierAndClientInfo supplierAndClientInfo = 2;</code>
             */
            public Builder setSupplierAndClientInfo(
                    SupplierAndClientInfo.Builder builderForValue) {
                if (supplierAndClientInfoBuilder_ == null) {
                    supplierAndClientInfo_ = builderForValue.build();
                    onChanged();
                } else {
                    supplierAndClientInfoBuilder_.setMessage(builderForValue.build());
                }
                bitField0_ |= 0x00000002;
                return this;
            }
            /**
             * <pre>
             * The supplier and client information.
             * </pre>
             *
             * <code>optional .model.traffic.SupplierAndClientInfo supplierAndClientInfo = 2;</code>
             */
            public Builder mergeSupplierAndClientInfo(SupplierAndClientInfo value) {
                if (supplierAndClientInfoBuilder_ == null) {
                    if (((bitField0_ & 0x00000002) == 0x00000002) &&
                            supplierAndClientInfo_ != null &&
                            supplierAndClientInfo_ != SupplierAndClientInfo.getDefaultInstance()) {
                        supplierAndClientInfo_ =
                                SupplierAndClientInfo.newBuilder(supplierAndClientInfo_).mergeFrom(value).buildPartial();
                    } else {
                        supplierAndClientInfo_ = value;
                    }
                    onChanged();
                } else {
                    supplierAndClientInfoBuilder_.mergeFrom(value);
                }
                bitField0_ |= 0x00000002;
                return this;
            }
            /**
             * <pre>
             * The supplier and client information.
             * </pre>
             *
             * <code>optional .model.traffic.SupplierAndClientInfo supplierAndClientInfo = 2;</code>
             */
            public Builder clearSupplierAndClientInfo() {
                if (supplierAndClientInfoBuilder_ == null) {
                    supplierAndClientInfo_ = null;
                    onChanged();
                } else {
                    supplierAndClientInfoBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000002);
                return this;
            }
            /**
             * <pre>
             * The supplier and client information.
             * </pre>
             *
             * <code>optional .model.traffic.SupplierAndClientInfo supplierAndClientInfo = 2;</code>
             */
            public SupplierAndClientInfo.Builder getSupplierAndClientInfoBuilder() {
                bitField0_ |= 0x00000002;
                onChanged();
                return getSupplierAndClientInfoFieldBuilder().getBuilder();
            }
            /**
             * <pre>
             * The supplier and client information.
             * </pre>
             *
             * <code>optional .model.traffic.SupplierAndClientInfo supplierAndClientInfo = 2;</code>
             */
            public SupplierAndClientInfoOrBuilder getSupplierAndClientInfoOrBuilder() {
                if (supplierAndClientInfoBuilder_ != null) {
                    return supplierAndClientInfoBuilder_.getMessageOrBuilder();
                } else {
                    return supplierAndClientInfo_ == null ?
                            SupplierAndClientInfo.getDefaultInstance() : supplierAndClientInfo_;
                }
            }
            /**
             * <pre>
             * The supplier and client information.
             * </pre>
             *
             * <code>optional .model.traffic.SupplierAndClientInfo supplierAndClientInfo = 2;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    SupplierAndClientInfo, SupplierAndClientInfo.Builder, SupplierAndClientInfoOrBuilder>
            getSupplierAndClientInfoFieldBuilder() {
                if (supplierAndClientInfoBuilder_ == null) {
                    supplierAndClientInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            SupplierAndClientInfo, SupplierAndClientInfo.Builder, SupplierAndClientInfoOrBuilder>(
                            getSupplierAndClientInfo(),
                            getParentForChildren(),
                            isClean());
                    supplierAndClientInfo_ = null;
                }
                return supplierAndClientInfoBuilder_;
            }

            private int formatVersion_ ;
            /**
             * <pre>
             * The format version. Can be used for debugging in order to compare
             * the version of the protocol buffer on client and supplier side.
             * </pre>
             *
             * <code>optional int32 formatVersion = 3;</code>
             */
            public boolean hasFormatVersion() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <pre>
             * The format version. Can be used for debugging in order to compare
             * the version of the protocol buffer on client and supplier side.
             * </pre>
             *
             * <code>optional int32 formatVersion = 3;</code>
             */
            public int getFormatVersion() {
                return formatVersion_;
            }
            /**
             * <pre>
             * The format version. Can be used for debugging in order to compare
             * the version of the protocol buffer on client and supplier side.
             * </pre>
             *
             * <code>optional int32 formatVersion = 3;</code>
             */
            public Builder setFormatVersion(int value) {
                bitField0_ |= 0x00000004;
                formatVersion_ = value;
                onChanged();
                return this;
            }
            /**
             * <pre>
             * The format version. Can be used for debugging in order to compare
             * the version of the protocol buffer on client and supplier side.
             * </pre>
             *
             * <code>optional int32 formatVersion = 3;</code>
             */
            public Builder clearFormatVersion() {
                bitField0_ = (bitField0_ & ~0x00000004);
                formatVersion_ = 0;
                onChanged();
                return this;
            }
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:model.traffic.MetaInformation)
        }

        // @@protoc_insertion_point(class_scope:model.traffic.MetaInformation)
        private static final MetaInformation DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new MetaInformation();
        }

        public static MetaInformation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @Deprecated public static final com.google.protobuf.Parser<MetaInformation>
                PARSER = new com.google.protobuf.AbstractParser<MetaInformation>() {
            public MetaInformation parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new MetaInformation(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<MetaInformation> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<MetaInformation> getParserForType() {
            return PARSER;
        }

        public MetaInformation getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface SupplierAndClientInfoOrBuilder extends
            // @@protoc_insertion_point(interface_extends:model.traffic.SupplierAndClientInfo)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <pre>
         * Identifies the client.
         * </pre>
         *
         * <code>optional string clientID = 1;</code>
         */
        boolean hasClientID();
        /**
         * <pre>
         * Identifies the client.
         * </pre>
         *
         * <code>optional string clientID = 1;</code>
         */
        String getClientID();
        /**
         * <pre>
         * Identifies the client.
         * </pre>
         *
         * <code>optional string clientID = 1;</code>
         */
        com.google.protobuf.ByteString
        getClientIDBytes();

        /**
         * <pre>
         * Identifies the supplier.
         * </pre>
         *
         * <code>optional string supplierID = 2;</code>
         */
        boolean hasSupplierID();
        /**
         * <pre>
         * Identifies the supplier.
         * </pre>
         *
         * <code>optional string supplierID = 2;</code>
         */
        String getSupplierID();
        /**
         * <pre>
         * Identifies the supplier.
         * </pre>
         *
         * <code>optional string supplierID = 2;</code>
         */
        com.google.protobuf.ByteString
        getSupplierIDBytes();
    }
    /**
     * <pre>
     * The supplier and client information message is used to identify the client
     * and the supplier.
     * </pre>
     *
     * Protobuf type {@code model.traffic.SupplierAndClientInfo}
     */
    public  static final class SupplierAndClientInfo extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:model.traffic.SupplierAndClientInfo)
            SupplierAndClientInfoOrBuilder {
        // Use SupplierAndClientInfo.newBuilder() to construct.
        private SupplierAndClientInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private SupplierAndClientInfo() {
            clientID_ = "";
            supplierID_ = "";
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private SupplierAndClientInfo(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            com.google.protobuf.ByteString bs = input.readBytes();
                            bitField0_ |= 0x00000001;
                            clientID_ = bs;
                            break;
                        }
                        case 18: {
                            com.google.protobuf.ByteString bs = input.readBytes();
                            bitField0_ |= 0x00000002;
                            supplierID_ = bs;
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return ProtobufTrafficFlowV5.internal_static_model_traffic_SupplierAndClientInfo_descriptor;
        }

        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return ProtobufTrafficFlowV5.internal_static_model_traffic_SupplierAndClientInfo_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            SupplierAndClientInfo.class, Builder.class);
        }

        private int bitField0_;
        public static final int CLIENTID_FIELD_NUMBER = 1;
        private volatile Object clientID_;
        /**
         * <pre>
         * Identifies the client.
         * </pre>
         *
         * <code>optional string clientID = 1;</code>
         */
        public boolean hasClientID() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <pre>
         * Identifies the client.
         * </pre>
         *
         * <code>optional string clientID = 1;</code>
         */
        public String getClientID() {
            Object ref = clientID_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    clientID_ = s;
                }
                return s;
            }
        }
        /**
         * <pre>
         * Identifies the client.
         * </pre>
         *
         * <code>optional string clientID = 1;</code>
         */
        public com.google.protobuf.ByteString
        getClientIDBytes() {
            Object ref = clientID_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                clientID_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int SUPPLIERID_FIELD_NUMBER = 2;
        private volatile Object supplierID_;
        /**
         * <pre>
         * Identifies the supplier.
         * </pre>
         *
         * <code>optional string supplierID = 2;</code>
         */
        public boolean hasSupplierID() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <pre>
         * Identifies the supplier.
         * </pre>
         *
         * <code>optional string supplierID = 2;</code>
         */
        public String getSupplierID() {
            Object ref = supplierID_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    supplierID_ = s;
                }
                return s;
            }
        }
        /**
         * <pre>
         * Identifies the supplier.
         * </pre>
         *
         * <code>optional string supplierID = 2;</code>
         */
        public com.google.protobuf.ByteString
        getSupplierIDBytes() {
            Object ref = supplierID_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                supplierID_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, clientID_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, supplierID_);
            }
            unknownFields.writeTo(output);
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, clientID_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, supplierID_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SupplierAndClientInfo)) {
                return super.equals(obj);
            }
            SupplierAndClientInfo other = (SupplierAndClientInfo) obj;

            boolean result = true;
            result = result && (hasClientID() == other.hasClientID());
            if (hasClientID()) {
                result = result && getClientID()
                        .equals(other.getClientID());
            }
            result = result && (hasSupplierID() == other.hasSupplierID());
            if (hasSupplierID()) {
                result = result && getSupplierID()
                        .equals(other.getSupplierID());
            }
            result = result && unknownFields.equals(other.unknownFields);
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (hasClientID()) {
                hash = (37 * hash) + CLIENTID_FIELD_NUMBER;
                hash = (53 * hash) + getClientID().hashCode();
            }
            if (hasSupplierID()) {
                hash = (37 * hash) + SUPPLIERID_FIELD_NUMBER;
                hash = (53 * hash) + getSupplierID().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static SupplierAndClientInfo parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SupplierAndClientInfo parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SupplierAndClientInfo parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SupplierAndClientInfo parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SupplierAndClientInfo parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SupplierAndClientInfo parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SupplierAndClientInfo parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static SupplierAndClientInfo parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static SupplierAndClientInfo parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static SupplierAndClientInfo parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static SupplierAndClientInfo parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static SupplierAndClientInfo parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(SupplierAndClientInfo prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(
                BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * <pre>
         * The supplier and client information message is used to identify the client
         * and the supplier.
         * </pre>
         *
         * Protobuf type {@code model.traffic.SupplierAndClientInfo}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:model.traffic.SupplierAndClientInfo)
                SupplierAndClientInfoOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ProtobufTrafficFlowV5.internal_static_model_traffic_SupplierAndClientInfo_descriptor;
            }

            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ProtobufTrafficFlowV5.internal_static_model_traffic_SupplierAndClientInfo_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                SupplierAndClientInfo.class, Builder.class);
            }

            // Construct using model.traffic.ProtobufTrafficFlowV5.SupplierAndClientInfo.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }
            public Builder clear() {
                super.clear();
                clientID_ = "";
                bitField0_ = (bitField0_ & ~0x00000001);
                supplierID_ = "";
                bitField0_ = (bitField0_ & ~0x00000002);
                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return ProtobufTrafficFlowV5.internal_static_model_traffic_SupplierAndClientInfo_descriptor;
            }

            public SupplierAndClientInfo getDefaultInstanceForType() {
                return SupplierAndClientInfo.getDefaultInstance();
            }

            public SupplierAndClientInfo build() {
                SupplierAndClientInfo result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public SupplierAndClientInfo buildPartial() {
                SupplierAndClientInfo result = new SupplierAndClientInfo(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.clientID_ = clientID_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.supplierID_ = supplierID_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof SupplierAndClientInfo) {
                    return mergeFrom((SupplierAndClientInfo)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(SupplierAndClientInfo other) {
                if (other == SupplierAndClientInfo.getDefaultInstance()) return this;
                if (other.hasClientID()) {
                    bitField0_ |= 0x00000001;
                    clientID_ = other.clientID_;
                    onChanged();
                }
                if (other.hasSupplierID()) {
                    bitField0_ |= 0x00000002;
                    supplierID_ = other.supplierID_;
                    onChanged();
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                SupplierAndClientInfo parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (SupplierAndClientInfo) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            private Object clientID_ = "";
            /**
             * <pre>
             * Identifies the client.
             * </pre>
             *
             * <code>optional string clientID = 1;</code>
             */
            public boolean hasClientID() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <pre>
             * Identifies the client.
             * </pre>
             *
             * <code>optional string clientID = 1;</code>
             */
            public String getClientID() {
                Object ref = clientID_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        clientID_ = s;
                    }
                    return s;
                } else {
                    return (String) ref;
                }
            }
            /**
             * <pre>
             * Identifies the client.
             * </pre>
             *
             * <code>optional string clientID = 1;</code>
             */
            public com.google.protobuf.ByteString
            getClientIDBytes() {
                Object ref = clientID_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    clientID_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <pre>
             * Identifies the client.
             * </pre>
             *
             * <code>optional string clientID = 1;</code>
             */
            public Builder setClientID(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                clientID_ = value;
                onChanged();
                return this;
            }
            /**
             * <pre>
             * Identifies the client.
             * </pre>
             *
             * <code>optional string clientID = 1;</code>
             */
            public Builder clearClientID() {
                bitField0_ = (bitField0_ & ~0x00000001);
                clientID_ = getDefaultInstance().getClientID();
                onChanged();
                return this;
            }
            /**
             * <pre>
             * Identifies the client.
             * </pre>
             *
             * <code>optional string clientID = 1;</code>
             */
            public Builder setClientIDBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                clientID_ = value;
                onChanged();
                return this;
            }

            private Object supplierID_ = "";
            /**
             * <pre>
             * Identifies the supplier.
             * </pre>
             *
             * <code>optional string supplierID = 2;</code>
             */
            public boolean hasSupplierID() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <pre>
             * Identifies the supplier.
             * </pre>
             *
             * <code>optional string supplierID = 2;</code>
             */
            public String getSupplierID() {
                Object ref = supplierID_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        supplierID_ = s;
                    }
                    return s;
                } else {
                    return (String) ref;
                }
            }
            /**
             * <pre>
             * Identifies the supplier.
             * </pre>
             *
             * <code>optional string supplierID = 2;</code>
             */
            public com.google.protobuf.ByteString
            getSupplierIDBytes() {
                Object ref = supplierID_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    supplierID_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <pre>
             * Identifies the supplier.
             * </pre>
             *
             * <code>optional string supplierID = 2;</code>
             */
            public Builder setSupplierID(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                supplierID_ = value;
                onChanged();
                return this;
            }
            /**
             * <pre>
             * Identifies the supplier.
             * </pre>
             *
             * <code>optional string supplierID = 2;</code>
             */
            public Builder clearSupplierID() {
                bitField0_ = (bitField0_ & ~0x00000002);
                supplierID_ = getDefaultInstance().getSupplierID();
                onChanged();
                return this;
            }
            /**
             * <pre>
             * Identifies the supplier.
             * </pre>
             *
             * <code>optional string supplierID = 2;</code>
             */
            public Builder setSupplierIDBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                supplierID_ = value;
                onChanged();
                return this;
            }
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:model.traffic.SupplierAndClientInfo)
        }

        // @@protoc_insertion_point(class_scope:model.traffic.SupplierAndClientInfo)
        private static final SupplierAndClientInfo DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new SupplierAndClientInfo();
        }

        public static SupplierAndClientInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @Deprecated public static final com.google.protobuf.Parser<SupplierAndClientInfo>
                PARSER = new com.google.protobuf.AbstractParser<SupplierAndClientInfo>() {
            public SupplierAndClientInfo parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new SupplierAndClientInfo(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<SupplierAndClientInfo> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<SupplierAndClientInfo> getParserForType() {
            return PARSER;
        }

        public SupplierAndClientInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface TrafficFlowOrBuilder extends
            // @@protoc_insertion_point(interface_extends:model.traffic.TrafficFlow)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <pre>
         * The location information.
         * </pre>
         *
         * <code>optional .model.traffic.Location location = 1;</code>
         */
        boolean hasLocation();
        /**
         * <pre>
         * The location information.
         * </pre>
         *
         * <code>optional .model.traffic.Location location = 1;</code>
         */
        Location getLocation();
        /**
         * <pre>
         * The location information.
         * </pre>
         *
         * <code>optional .model.traffic.Location location = 1;</code>
         */
        LocationOrBuilder getLocationOrBuilder();

        /**
         * <pre>
         * The speed information.
         * </pre>
         *
         * <code>optional .model.traffic.Speed speed = 2;</code>
         */
        boolean hasSpeed();
        /**
         * <pre>
         * The speed information.
         * </pre>
         *
         * <code>optional .model.traffic.Speed speed = 2;</code>
         */
        Speed getSpeed();
        /**
         * <pre>
         * The speed information.
         * </pre>
         *
         * <code>optional .model.traffic.Speed speed = 2;</code>
         */
        SpeedOrBuilder getSpeedOrBuilder();

        /**
         * <pre>
         * Flag indicating road closures.
         * </pre>
         *
         * <code>optional bool roadClosure = 3 [default = false];</code>
         */
        boolean hasRoadClosure();
        /**
         * <pre>
         * Flag indicating road closures.
         * </pre>
         *
         * <code>optional bool roadClosure = 3 [default = false];</code>
         */
        boolean getRoadClosure();
    }
    /**
     * <pre>
     * The traffic flow message assigns speed information to a location.
     * </pre>
     *
     * Protobuf type {@code model.traffic.TrafficFlow}
     */
    public  static final class TrafficFlow extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:model.traffic.TrafficFlow)
            TrafficFlowOrBuilder {
        // Use TrafficFlow.newBuilder() to construct.
        private TrafficFlow(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private TrafficFlow() {
            roadClosure_ = false;
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private TrafficFlow(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            Location.Builder subBuilder = null;
                            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                                subBuilder = location_.toBuilder();
                            }
                            location_ = input.readMessage(Location.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(location_);
                                location_ = subBuilder.buildPartial();
                            }
                            bitField0_ |= 0x00000001;
                            break;
                        }
                        case 18: {
                            Speed.Builder subBuilder = null;
                            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                                subBuilder = speed_.toBuilder();
                            }
                            speed_ = input.readMessage(Speed.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(speed_);
                                speed_ = subBuilder.buildPartial();
                            }
                            bitField0_ |= 0x00000002;
                            break;
                        }
                        case 24: {
                            bitField0_ |= 0x00000004;
                            roadClosure_ = input.readBool();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return ProtobufTrafficFlowV5.internal_static_model_traffic_TrafficFlow_descriptor;
        }

        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return ProtobufTrafficFlowV5.internal_static_model_traffic_TrafficFlow_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            TrafficFlow.class, Builder.class);
        }

        private int bitField0_;
        public static final int LOCATION_FIELD_NUMBER = 1;
        private Location location_;
        /**
         * <pre>
         * The location information.
         * </pre>
         *
         * <code>optional .model.traffic.Location location = 1;</code>
         */
        public boolean hasLocation() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <pre>
         * The location information.
         * </pre>
         *
         * <code>optional .model.traffic.Location location = 1;</code>
         */
        public Location getLocation() {
            return location_ == null ? Location.getDefaultInstance() : location_;
        }
        /**
         * <pre>
         * The location information.
         * </pre>
         *
         * <code>optional .model.traffic.Location location = 1;</code>
         */
        public LocationOrBuilder getLocationOrBuilder() {
            return location_ == null ? Location.getDefaultInstance() : location_;
        }

        public static final int SPEED_FIELD_NUMBER = 2;
        private Speed speed_;
        /**
         * <pre>
         * The speed information.
         * </pre>
         *
         * <code>optional .model.traffic.Speed speed = 2;</code>
         */
        public boolean hasSpeed() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <pre>
         * The speed information.
         * </pre>
         *
         * <code>optional .model.traffic.Speed speed = 2;</code>
         */
        public Speed getSpeed() {
            return speed_ == null ? Speed.getDefaultInstance() : speed_;
        }
        /**
         * <pre>
         * The speed information.
         * </pre>
         *
         * <code>optional .model.traffic.Speed speed = 2;</code>
         */
        public SpeedOrBuilder getSpeedOrBuilder() {
            return speed_ == null ? Speed.getDefaultInstance() : speed_;
        }

        public static final int ROADCLOSURE_FIELD_NUMBER = 3;
        private boolean roadClosure_;
        /**
         * <pre>
         * Flag indicating road closures.
         * </pre>
         *
         * <code>optional bool roadClosure = 3 [default = false];</code>
         */
        public boolean hasRoadClosure() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <pre>
         * Flag indicating road closures.
         * </pre>
         *
         * <code>optional bool roadClosure = 3 [default = false];</code>
         */
        public boolean getRoadClosure() {
            return roadClosure_;
        }

        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeMessage(1, getLocation());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeMessage(2, getSpeed());
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeBool(3, roadClosure_);
            }
            unknownFields.writeTo(output);
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(1, getLocation());
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(2, getSpeed());
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(3, roadClosure_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TrafficFlow)) {
                return super.equals(obj);
            }
            TrafficFlow other = (TrafficFlow) obj;

            boolean result = true;
            result = result && (hasLocation() == other.hasLocation());
            if (hasLocation()) {
                result = result && getLocation()
                        .equals(other.getLocation());
            }
            result = result && (hasSpeed() == other.hasSpeed());
            if (hasSpeed()) {
                result = result && getSpeed()
                        .equals(other.getSpeed());
            }
            result = result && (hasRoadClosure() == other.hasRoadClosure());
            if (hasRoadClosure()) {
                result = result && (getRoadClosure()
                        == other.getRoadClosure());
            }
            result = result && unknownFields.equals(other.unknownFields);
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (hasLocation()) {
                hash = (37 * hash) + LOCATION_FIELD_NUMBER;
                hash = (53 * hash) + getLocation().hashCode();
            }
            if (hasSpeed()) {
                hash = (37 * hash) + SPEED_FIELD_NUMBER;
                hash = (53 * hash) + getSpeed().hashCode();
            }
            if (hasRoadClosure()) {
                hash = (37 * hash) + ROADCLOSURE_FIELD_NUMBER;
                hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
                        getRoadClosure());
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static TrafficFlow parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static TrafficFlow parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static TrafficFlow parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static TrafficFlow parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static TrafficFlow parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static TrafficFlow parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static TrafficFlow parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static TrafficFlow parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static TrafficFlow parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static TrafficFlow parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static TrafficFlow parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static TrafficFlow parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(TrafficFlow prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(
                BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * <pre>
         * The traffic flow message assigns speed information to a location.
         * </pre>
         *
         * Protobuf type {@code model.traffic.TrafficFlow}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:model.traffic.TrafficFlow)
                TrafficFlowOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ProtobufTrafficFlowV5.internal_static_model_traffic_TrafficFlow_descriptor;
            }

            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ProtobufTrafficFlowV5.internal_static_model_traffic_TrafficFlow_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                TrafficFlow.class, Builder.class);
            }

            // Construct using model.traffic.ProtobufTrafficFlowV5.TrafficFlow.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                    getLocationFieldBuilder();
                    getSpeedFieldBuilder();
                }
            }
            public Builder clear() {
                super.clear();
                if (locationBuilder_ == null) {
                    location_ = null;
                } else {
                    locationBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000001);
                if (speedBuilder_ == null) {
                    speed_ = null;
                } else {
                    speedBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000002);
                roadClosure_ = false;
                bitField0_ = (bitField0_ & ~0x00000004);
                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return ProtobufTrafficFlowV5.internal_static_model_traffic_TrafficFlow_descriptor;
            }

            public TrafficFlow getDefaultInstanceForType() {
                return TrafficFlow.getDefaultInstance();
            }

            public TrafficFlow build() {
                TrafficFlow result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public TrafficFlow buildPartial() {
                TrafficFlow result = new TrafficFlow(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                if (locationBuilder_ == null) {
                    result.location_ = location_;
                } else {
                    result.location_ = locationBuilder_.build();
                }
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                if (speedBuilder_ == null) {
                    result.speed_ = speed_;
                } else {
                    result.speed_ = speedBuilder_.build();
                }
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.roadClosure_ = roadClosure_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof TrafficFlow) {
                    return mergeFrom((TrafficFlow)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(TrafficFlow other) {
                if (other == TrafficFlow.getDefaultInstance()) return this;
                if (other.hasLocation()) {
                    mergeLocation(other.getLocation());
                }
                if (other.hasSpeed()) {
                    mergeSpeed(other.getSpeed());
                }
                if (other.hasRoadClosure()) {
                    setRoadClosure(other.getRoadClosure());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                TrafficFlow parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (TrafficFlow) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            private Location location_ = null;
            private com.google.protobuf.SingleFieldBuilderV3<
                    Location, Location.Builder, LocationOrBuilder> locationBuilder_;
            /**
             * <pre>
             * The location information.
             * </pre>
             *
             * <code>optional .model.traffic.Location location = 1;</code>
             */
            public boolean hasLocation() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <pre>
             * The location information.
             * </pre>
             *
             * <code>optional .model.traffic.Location location = 1;</code>
             */
            public Location getLocation() {
                if (locationBuilder_ == null) {
                    return location_ == null ? Location.getDefaultInstance() : location_;
                } else {
                    return locationBuilder_.getMessage();
                }
            }
            /**
             * <pre>
             * The location information.
             * </pre>
             *
             * <code>optional .model.traffic.Location location = 1;</code>
             */
            public Builder setLocation(Location value) {
                if (locationBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    location_ = value;
                    onChanged();
                } else {
                    locationBuilder_.setMessage(value);
                }
                bitField0_ |= 0x00000001;
                return this;
            }
            /**
             * <pre>
             * The location information.
             * </pre>
             *
             * <code>optional .model.traffic.Location location = 1;</code>
             */
            public Builder setLocation(
                    Location.Builder builderForValue) {
                if (locationBuilder_ == null) {
                    location_ = builderForValue.build();
                    onChanged();
                } else {
                    locationBuilder_.setMessage(builderForValue.build());
                }
                bitField0_ |= 0x00000001;
                return this;
            }
            /**
             * <pre>
             * The location information.
             * </pre>
             *
             * <code>optional .model.traffic.Location location = 1;</code>
             */
            public Builder mergeLocation(Location value) {
                if (locationBuilder_ == null) {
                    if (((bitField0_ & 0x00000001) == 0x00000001) &&
                            location_ != null &&
                            location_ != Location.getDefaultInstance()) {
                        location_ =
                                Location.newBuilder(location_).mergeFrom(value).buildPartial();
                    } else {
                        location_ = value;
                    }
                    onChanged();
                } else {
                    locationBuilder_.mergeFrom(value);
                }
                bitField0_ |= 0x00000001;
                return this;
            }
            /**
             * <pre>
             * The location information.
             * </pre>
             *
             * <code>optional .model.traffic.Location location = 1;</code>
             */
            public Builder clearLocation() {
                if (locationBuilder_ == null) {
                    location_ = null;
                    onChanged();
                } else {
                    locationBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000001);
                return this;
            }
            /**
             * <pre>
             * The location information.
             * </pre>
             *
             * <code>optional .model.traffic.Location location = 1;</code>
             */
            public Location.Builder getLocationBuilder() {
                bitField0_ |= 0x00000001;
                onChanged();
                return getLocationFieldBuilder().getBuilder();
            }
            /**
             * <pre>
             * The location information.
             * </pre>
             *
             * <code>optional .model.traffic.Location location = 1;</code>
             */
            public LocationOrBuilder getLocationOrBuilder() {
                if (locationBuilder_ != null) {
                    return locationBuilder_.getMessageOrBuilder();
                } else {
                    return location_ == null ?
                            Location.getDefaultInstance() : location_;
                }
            }
            /**
             * <pre>
             * The location information.
             * </pre>
             *
             * <code>optional .model.traffic.Location location = 1;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    Location, Location.Builder, LocationOrBuilder>
            getLocationFieldBuilder() {
                if (locationBuilder_ == null) {
                    locationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            Location, Location.Builder, LocationOrBuilder>(
                            getLocation(),
                            getParentForChildren(),
                            isClean());
                    location_ = null;
                }
                return locationBuilder_;
            }

            private Speed speed_ = null;
            private com.google.protobuf.SingleFieldBuilderV3<
                    Speed, Speed.Builder, SpeedOrBuilder> speedBuilder_;
            /**
             * <pre>
             * The speed information.
             * </pre>
             *
             * <code>optional .model.traffic.Speed speed = 2;</code>
             */
            public boolean hasSpeed() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <pre>
             * The speed information.
             * </pre>
             *
             * <code>optional .model.traffic.Speed speed = 2;</code>
             */
            public Speed getSpeed() {
                if (speedBuilder_ == null) {
                    return speed_ == null ? Speed.getDefaultInstance() : speed_;
                } else {
                    return speedBuilder_.getMessage();
                }
            }
            /**
             * <pre>
             * The speed information.
             * </pre>
             *
             * <code>optional .model.traffic.Speed speed = 2;</code>
             */
            public Builder setSpeed(Speed value) {
                if (speedBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    speed_ = value;
                    onChanged();
                } else {
                    speedBuilder_.setMessage(value);
                }
                bitField0_ |= 0x00000002;
                return this;
            }
            /**
             * <pre>
             * The speed information.
             * </pre>
             *
             * <code>optional .model.traffic.Speed speed = 2;</code>
             */
            public Builder setSpeed(
                    Speed.Builder builderForValue) {
                if (speedBuilder_ == null) {
                    speed_ = builderForValue.build();
                    onChanged();
                } else {
                    speedBuilder_.setMessage(builderForValue.build());
                }
                bitField0_ |= 0x00000002;
                return this;
            }
            /**
             * <pre>
             * The speed information.
             * </pre>
             *
             * <code>optional .model.traffic.Speed speed = 2;</code>
             */
            public Builder mergeSpeed(Speed value) {
                if (speedBuilder_ == null) {
                    if (((bitField0_ & 0x00000002) == 0x00000002) &&
                            speed_ != null &&
                            speed_ != Speed.getDefaultInstance()) {
                        speed_ =
                                Speed.newBuilder(speed_).mergeFrom(value).buildPartial();
                    } else {
                        speed_ = value;
                    }
                    onChanged();
                } else {
                    speedBuilder_.mergeFrom(value);
                }
                bitField0_ |= 0x00000002;
                return this;
            }
            /**
             * <pre>
             * The speed information.
             * </pre>
             *
             * <code>optional .model.traffic.Speed speed = 2;</code>
             */
            public Builder clearSpeed() {
                if (speedBuilder_ == null) {
                    speed_ = null;
                    onChanged();
                } else {
                    speedBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000002);
                return this;
            }
            /**
             * <pre>
             * The speed information.
             * </pre>
             *
             * <code>optional .model.traffic.Speed speed = 2;</code>
             */
            public Speed.Builder getSpeedBuilder() {
                bitField0_ |= 0x00000002;
                onChanged();
                return getSpeedFieldBuilder().getBuilder();
            }
            /**
             * <pre>
             * The speed information.
             * </pre>
             *
             * <code>optional .model.traffic.Speed speed = 2;</code>
             */
            public SpeedOrBuilder getSpeedOrBuilder() {
                if (speedBuilder_ != null) {
                    return speedBuilder_.getMessageOrBuilder();
                } else {
                    return speed_ == null ?
                            Speed.getDefaultInstance() : speed_;
                }
            }
            /**
             * <pre>
             * The speed information.
             * </pre>
             *
             * <code>optional .model.traffic.Speed speed = 2;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    Speed, Speed.Builder, SpeedOrBuilder>
            getSpeedFieldBuilder() {
                if (speedBuilder_ == null) {
                    speedBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            Speed, Speed.Builder, SpeedOrBuilder>(
                            getSpeed(),
                            getParentForChildren(),
                            isClean());
                    speed_ = null;
                }
                return speedBuilder_;
            }

            private boolean roadClosure_ ;
            /**
             * <pre>
             * Flag indicating road closures.
             * </pre>
             *
             * <code>optional bool roadClosure = 3 [default = false];</code>
             */
            public boolean hasRoadClosure() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <pre>
             * Flag indicating road closures.
             * </pre>
             *
             * <code>optional bool roadClosure = 3 [default = false];</code>
             */
            public boolean getRoadClosure() {
                return roadClosure_;
            }
            /**
             * <pre>
             * Flag indicating road closures.
             * </pre>
             *
             * <code>optional bool roadClosure = 3 [default = false];</code>
             */
            public Builder setRoadClosure(boolean value) {
                bitField0_ |= 0x00000004;
                roadClosure_ = value;
                onChanged();
                return this;
            }
            /**
             * <pre>
             * Flag indicating road closures.
             * </pre>
             *
             * <code>optional bool roadClosure = 3 [default = false];</code>
             */
            public Builder clearRoadClosure() {
                bitField0_ = (bitField0_ & ~0x00000004);
                roadClosure_ = false;
                onChanged();
                return this;
            }
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:model.traffic.TrafficFlow)
        }

        // @@protoc_insertion_point(class_scope:model.traffic.TrafficFlow)
        private static final TrafficFlow DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new TrafficFlow();
        }

        public static TrafficFlow getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @Deprecated public static final com.google.protobuf.Parser<TrafficFlow>
                PARSER = new com.google.protobuf.AbstractParser<TrafficFlow>() {
            public TrafficFlow parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new TrafficFlow(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<TrafficFlow> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<TrafficFlow> getParserForType() {
            return PARSER;
        }

        public TrafficFlow getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface TrafficFlowWithPredictionOrBuilder extends
            // @@protoc_insertion_point(interface_extends:model.traffic.TrafficFlowWithPrediction)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <pre>
         * The location information.
         * </pre>
         *
         * <code>optional .model.traffic.Location location = 1;</code>
         */
        boolean hasLocation();
        /**
         * <pre>
         * The location information.
         * </pre>
         *
         * <code>optional .model.traffic.Location location = 1;</code>
         */
        Location getLocation();
        /**
         * <pre>
         * The location information.
         * </pre>
         *
         * <code>optional .model.traffic.Location location = 1;</code>
         */
        LocationOrBuilder getLocationOrBuilder();

        /**
         * <pre>
         * The speed information.
         * </pre>
         *
         * <code>repeated .model.traffic.SpeedWithTimeStamp speed = 2;</code>
         */
        java.util.List<SpeedWithTimeStamp>
        getSpeedList();
        /**
         * <pre>
         * The speed information.
         * </pre>
         *
         * <code>repeated .model.traffic.SpeedWithTimeStamp speed = 2;</code>
         */
        SpeedWithTimeStamp getSpeed(int index);
        /**
         * <pre>
         * The speed information.
         * </pre>
         *
         * <code>repeated .model.traffic.SpeedWithTimeStamp speed = 2;</code>
         */
        int getSpeedCount();
        /**
         * <pre>
         * The speed information.
         * </pre>
         *
         * <code>repeated .model.traffic.SpeedWithTimeStamp speed = 2;</code>
         */
        java.util.List<? extends SpeedWithTimeStampOrBuilder>
        getSpeedOrBuilderList();
        /**
         * <pre>
         * The speed information.
         * </pre>
         *
         * <code>repeated .model.traffic.SpeedWithTimeStamp speed = 2;</code>
         */
        SpeedWithTimeStampOrBuilder getSpeedOrBuilder(
                int index);

        /**
         * <pre>
         * Flag indicating road closures.
         * </pre>
         *
         * <code>optional bool roadClosure = 3 [default = false];</code>
         */
        boolean hasRoadClosure();
        /**
         * <pre>
         * Flag indicating road closures.
         * </pre>
         *
         * <code>optional bool roadClosure = 3 [default = false];</code>
         */
        boolean getRoadClosure();

        /**
         * <pre>
         * Expected time in minutes it takes until the current speed equals the usual speed.
         * </pre>
         *
         * <code>optional uint32 timeToUsualInMinutes = 4;</code>
         */
        boolean hasTimeToUsualInMinutes();
        /**
         * <pre>
         * Expected time in minutes it takes until the current speed equals the usual speed.
         * </pre>
         *
         * <code>optional uint32 timeToUsualInMinutes = 4;</code>
         */
        int getTimeToUsualInMinutes();
    }
    /**
     * <pre>
     * A traffic flow message type dedicated for flow prediction.
     * </pre>
     *
     * Protobuf type {@code model.traffic.TrafficFlowWithPrediction}
     */
    public  static final class TrafficFlowWithPrediction extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:model.traffic.TrafficFlowWithPrediction)
            TrafficFlowWithPredictionOrBuilder {
        // Use TrafficFlowWithPrediction.newBuilder() to construct.
        private TrafficFlowWithPrediction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private TrafficFlowWithPrediction() {
            speed_ = java.util.Collections.emptyList();
            roadClosure_ = false;
            timeToUsualInMinutes_ = 0;
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private TrafficFlowWithPrediction(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            Location.Builder subBuilder = null;
                            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                                subBuilder = location_.toBuilder();
                            }
                            location_ = input.readMessage(Location.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(location_);
                                location_ = subBuilder.buildPartial();
                            }
                            bitField0_ |= 0x00000001;
                            break;
                        }
                        case 18: {
                            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                                speed_ = new java.util.ArrayList<SpeedWithTimeStamp>();
                                mutable_bitField0_ |= 0x00000002;
                            }
                            speed_.add(
                                    input.readMessage(SpeedWithTimeStamp.PARSER, extensionRegistry));
                            break;
                        }
                        case 24: {
                            bitField0_ |= 0x00000002;
                            roadClosure_ = input.readBool();
                            break;
                        }
                        case 32: {
                            bitField0_ |= 0x00000004;
                            timeToUsualInMinutes_ = input.readUInt32();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                    speed_ = java.util.Collections.unmodifiableList(speed_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return ProtobufTrafficFlowV5.internal_static_model_traffic_TrafficFlowWithPrediction_descriptor;
        }

        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return ProtobufTrafficFlowV5.internal_static_model_traffic_TrafficFlowWithPrediction_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            TrafficFlowWithPrediction.class, Builder.class);
        }

        private int bitField0_;
        public static final int LOCATION_FIELD_NUMBER = 1;
        private Location location_;
        /**
         * <pre>
         * The location information.
         * </pre>
         *
         * <code>optional .model.traffic.Location location = 1;</code>
         */
        public boolean hasLocation() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <pre>
         * The location information.
         * </pre>
         *
         * <code>optional .model.traffic.Location location = 1;</code>
         */
        public Location getLocation() {
            return location_ == null ? Location.getDefaultInstance() : location_;
        }
        /**
         * <pre>
         * The location information.
         * </pre>
         *
         * <code>optional .model.traffic.Location location = 1;</code>
         */
        public LocationOrBuilder getLocationOrBuilder() {
            return location_ == null ? Location.getDefaultInstance() : location_;
        }

        public static final int SPEED_FIELD_NUMBER = 2;
        private java.util.List<SpeedWithTimeStamp> speed_;
        /**
         * <pre>
         * The speed information.
         * </pre>
         *
         * <code>repeated .model.traffic.SpeedWithTimeStamp speed = 2;</code>
         */
        public java.util.List<SpeedWithTimeStamp> getSpeedList() {
            return speed_;
        }
        /**
         * <pre>
         * The speed information.
         * </pre>
         *
         * <code>repeated .model.traffic.SpeedWithTimeStamp speed = 2;</code>
         */
        public java.util.List<? extends SpeedWithTimeStampOrBuilder>
        getSpeedOrBuilderList() {
            return speed_;
        }
        /**
         * <pre>
         * The speed information.
         * </pre>
         *
         * <code>repeated .model.traffic.SpeedWithTimeStamp speed = 2;</code>
         */
        public int getSpeedCount() {
            return speed_.size();
        }
        /**
         * <pre>
         * The speed information.
         * </pre>
         *
         * <code>repeated .model.traffic.SpeedWithTimeStamp speed = 2;</code>
         */
        public SpeedWithTimeStamp getSpeed(int index) {
            return speed_.get(index);
        }
        /**
         * <pre>
         * The speed information.
         * </pre>
         *
         * <code>repeated .model.traffic.SpeedWithTimeStamp speed = 2;</code>
         */
        public SpeedWithTimeStampOrBuilder getSpeedOrBuilder(
                int index) {
            return speed_.get(index);
        }

        public static final int ROADCLOSURE_FIELD_NUMBER = 3;
        private boolean roadClosure_;
        /**
         * <pre>
         * Flag indicating road closures.
         * </pre>
         *
         * <code>optional bool roadClosure = 3 [default = false];</code>
         */
        public boolean hasRoadClosure() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <pre>
         * Flag indicating road closures.
         * </pre>
         *
         * <code>optional bool roadClosure = 3 [default = false];</code>
         */
        public boolean getRoadClosure() {
            return roadClosure_;
        }

        public static final int TIMETOUSUALINMINUTES_FIELD_NUMBER = 4;
        private int timeToUsualInMinutes_;
        /**
         * <pre>
         * Expected time in minutes it takes until the current speed equals the usual speed.
         * </pre>
         *
         * <code>optional uint32 timeToUsualInMinutes = 4;</code>
         */
        public boolean hasTimeToUsualInMinutes() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <pre>
         * Expected time in minutes it takes until the current speed equals the usual speed.
         * </pre>
         *
         * <code>optional uint32 timeToUsualInMinutes = 4;</code>
         */
        public int getTimeToUsualInMinutes() {
            return timeToUsualInMinutes_;
        }

        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeMessage(1, getLocation());
            }
            for (int i = 0; i < speed_.size(); i++) {
                output.writeMessage(2, speed_.get(i));
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeBool(3, roadClosure_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeUInt32(4, timeToUsualInMinutes_);
            }
            unknownFields.writeTo(output);
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(1, getLocation());
            }
            for (int i = 0; i < speed_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(2, speed_.get(i));
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(3, roadClosure_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(4, timeToUsualInMinutes_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TrafficFlowWithPrediction)) {
                return super.equals(obj);
            }
            TrafficFlowWithPrediction other = (TrafficFlowWithPrediction) obj;

            boolean result = true;
            result = result && (hasLocation() == other.hasLocation());
            if (hasLocation()) {
                result = result && getLocation()
                        .equals(other.getLocation());
            }
            result = result && getSpeedList()
                    .equals(other.getSpeedList());
            result = result && (hasRoadClosure() == other.hasRoadClosure());
            if (hasRoadClosure()) {
                result = result && (getRoadClosure()
                        == other.getRoadClosure());
            }
            result = result && (hasTimeToUsualInMinutes() == other.hasTimeToUsualInMinutes());
            if (hasTimeToUsualInMinutes()) {
                result = result && (getTimeToUsualInMinutes()
                        == other.getTimeToUsualInMinutes());
            }
            result = result && unknownFields.equals(other.unknownFields);
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (hasLocation()) {
                hash = (37 * hash) + LOCATION_FIELD_NUMBER;
                hash = (53 * hash) + getLocation().hashCode();
            }
            if (getSpeedCount() > 0) {
                hash = (37 * hash) + SPEED_FIELD_NUMBER;
                hash = (53 * hash) + getSpeedList().hashCode();
            }
            if (hasRoadClosure()) {
                hash = (37 * hash) + ROADCLOSURE_FIELD_NUMBER;
                hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
                        getRoadClosure());
            }
            if (hasTimeToUsualInMinutes()) {
                hash = (37 * hash) + TIMETOUSUALINMINUTES_FIELD_NUMBER;
                hash = (53 * hash) + getTimeToUsualInMinutes();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static TrafficFlowWithPrediction parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static TrafficFlowWithPrediction parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static TrafficFlowWithPrediction parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static TrafficFlowWithPrediction parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static TrafficFlowWithPrediction parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static TrafficFlowWithPrediction parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static TrafficFlowWithPrediction parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static TrafficFlowWithPrediction parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static TrafficFlowWithPrediction parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static TrafficFlowWithPrediction parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static TrafficFlowWithPrediction parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static TrafficFlowWithPrediction parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(TrafficFlowWithPrediction prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(
                BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * <pre>
         * A traffic flow message type dedicated for flow prediction.
         * </pre>
         *
         * Protobuf type {@code model.traffic.TrafficFlowWithPrediction}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:model.traffic.TrafficFlowWithPrediction)
                TrafficFlowWithPredictionOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ProtobufTrafficFlowV5.internal_static_model_traffic_TrafficFlowWithPrediction_descriptor;
            }

            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ProtobufTrafficFlowV5.internal_static_model_traffic_TrafficFlowWithPrediction_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                TrafficFlowWithPrediction.class, Builder.class);
            }

            // Construct using model.traffic.ProtobufTrafficFlowV5.TrafficFlowWithPrediction.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                    getLocationFieldBuilder();
                    getSpeedFieldBuilder();
                }
            }
            public Builder clear() {
                super.clear();
                if (locationBuilder_ == null) {
                    location_ = null;
                } else {
                    locationBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000001);
                if (speedBuilder_ == null) {
                    speed_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000002);
                } else {
                    speedBuilder_.clear();
                }
                roadClosure_ = false;
                bitField0_ = (bitField0_ & ~0x00000004);
                timeToUsualInMinutes_ = 0;
                bitField0_ = (bitField0_ & ~0x00000008);
                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return ProtobufTrafficFlowV5.internal_static_model_traffic_TrafficFlowWithPrediction_descriptor;
            }

            public TrafficFlowWithPrediction getDefaultInstanceForType() {
                return TrafficFlowWithPrediction.getDefaultInstance();
            }

            public TrafficFlowWithPrediction build() {
                TrafficFlowWithPrediction result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public TrafficFlowWithPrediction buildPartial() {
                TrafficFlowWithPrediction result = new TrafficFlowWithPrediction(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                if (locationBuilder_ == null) {
                    result.location_ = location_;
                } else {
                    result.location_ = locationBuilder_.build();
                }
                if (speedBuilder_ == null) {
                    if (((bitField0_ & 0x00000002) == 0x00000002)) {
                        speed_ = java.util.Collections.unmodifiableList(speed_);
                        bitField0_ = (bitField0_ & ~0x00000002);
                    }
                    result.speed_ = speed_;
                } else {
                    result.speed_ = speedBuilder_.build();
                }
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.roadClosure_ = roadClosure_;
                if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.timeToUsualInMinutes_ = timeToUsualInMinutes_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof TrafficFlowWithPrediction) {
                    return mergeFrom((TrafficFlowWithPrediction)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(TrafficFlowWithPrediction other) {
                if (other == TrafficFlowWithPrediction.getDefaultInstance()) return this;
                if (other.hasLocation()) {
                    mergeLocation(other.getLocation());
                }
                if (speedBuilder_ == null) {
                    if (!other.speed_.isEmpty()) {
                        if (speed_.isEmpty()) {
                            speed_ = other.speed_;
                            bitField0_ = (bitField0_ & ~0x00000002);
                        } else {
                            ensureSpeedIsMutable();
                            speed_.addAll(other.speed_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.speed_.isEmpty()) {
                        if (speedBuilder_.isEmpty()) {
                            speedBuilder_.dispose();
                            speedBuilder_ = null;
                            speed_ = other.speed_;
                            bitField0_ = (bitField0_ & ~0x00000002);
                            speedBuilder_ =
                                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                            getSpeedFieldBuilder() : null;
                        } else {
                            speedBuilder_.addAllMessages(other.speed_);
                        }
                    }
                }
                if (other.hasRoadClosure()) {
                    setRoadClosure(other.getRoadClosure());
                }
                if (other.hasTimeToUsualInMinutes()) {
                    setTimeToUsualInMinutes(other.getTimeToUsualInMinutes());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                TrafficFlowWithPrediction parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (TrafficFlowWithPrediction) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            private Location location_ = null;
            private com.google.protobuf.SingleFieldBuilderV3<
                    Location, Location.Builder, LocationOrBuilder> locationBuilder_;
            /**
             * <pre>
             * The location information.
             * </pre>
             *
             * <code>optional .model.traffic.Location location = 1;</code>
             */
            public boolean hasLocation() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <pre>
             * The location information.
             * </pre>
             *
             * <code>optional .model.traffic.Location location = 1;</code>
             */
            public Location getLocation() {
                if (locationBuilder_ == null) {
                    return location_ == null ? Location.getDefaultInstance() : location_;
                } else {
                    return locationBuilder_.getMessage();
                }
            }
            /**
             * <pre>
             * The location information.
             * </pre>
             *
             * <code>optional .model.traffic.Location location = 1;</code>
             */
            public Builder setLocation(Location value) {
                if (locationBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    location_ = value;
                    onChanged();
                } else {
                    locationBuilder_.setMessage(value);
                }
                bitField0_ |= 0x00000001;
                return this;
            }
            /**
             * <pre>
             * The location information.
             * </pre>
             *
             * <code>optional .model.traffic.Location location = 1;</code>
             */
            public Builder setLocation(
                    Location.Builder builderForValue) {
                if (locationBuilder_ == null) {
                    location_ = builderForValue.build();
                    onChanged();
                } else {
                    locationBuilder_.setMessage(builderForValue.build());
                }
                bitField0_ |= 0x00000001;
                return this;
            }
            /**
             * <pre>
             * The location information.
             * </pre>
             *
             * <code>optional .model.traffic.Location location = 1;</code>
             */
            public Builder mergeLocation(Location value) {
                if (locationBuilder_ == null) {
                    if (((bitField0_ & 0x00000001) == 0x00000001) &&
                            location_ != null &&
                            location_ != Location.getDefaultInstance()) {
                        location_ =
                                Location.newBuilder(location_).mergeFrom(value).buildPartial();
                    } else {
                        location_ = value;
                    }
                    onChanged();
                } else {
                    locationBuilder_.mergeFrom(value);
                }
                bitField0_ |= 0x00000001;
                return this;
            }
            /**
             * <pre>
             * The location information.
             * </pre>
             *
             * <code>optional .model.traffic.Location location = 1;</code>
             */
            public Builder clearLocation() {
                if (locationBuilder_ == null) {
                    location_ = null;
                    onChanged();
                } else {
                    locationBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000001);
                return this;
            }
            /**
             * <pre>
             * The location information.
             * </pre>
             *
             * <code>optional .model.traffic.Location location = 1;</code>
             */
            public Location.Builder getLocationBuilder() {
                bitField0_ |= 0x00000001;
                onChanged();
                return getLocationFieldBuilder().getBuilder();
            }
            /**
             * <pre>
             * The location information.
             * </pre>
             *
             * <code>optional .model.traffic.Location location = 1;</code>
             */
            public LocationOrBuilder getLocationOrBuilder() {
                if (locationBuilder_ != null) {
                    return locationBuilder_.getMessageOrBuilder();
                } else {
                    return location_ == null ?
                            Location.getDefaultInstance() : location_;
                }
            }
            /**
             * <pre>
             * The location information.
             * </pre>
             *
             * <code>optional .model.traffic.Location location = 1;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    Location, Location.Builder, LocationOrBuilder>
            getLocationFieldBuilder() {
                if (locationBuilder_ == null) {
                    locationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            Location, Location.Builder, LocationOrBuilder>(
                            getLocation(),
                            getParentForChildren(),
                            isClean());
                    location_ = null;
                }
                return locationBuilder_;
            }

            private java.util.List<SpeedWithTimeStamp> speed_ =
                    java.util.Collections.emptyList();
            private void ensureSpeedIsMutable() {
                if (!((bitField0_ & 0x00000002) == 0x00000002)) {
                    speed_ = new java.util.ArrayList<SpeedWithTimeStamp>(speed_);
                    bitField0_ |= 0x00000002;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    SpeedWithTimeStamp, SpeedWithTimeStamp.Builder, SpeedWithTimeStampOrBuilder> speedBuilder_;

            /**
             * <pre>
             * The speed information.
             * </pre>
             *
             * <code>repeated .model.traffic.SpeedWithTimeStamp speed = 2;</code>
             */
            public java.util.List<SpeedWithTimeStamp> getSpeedList() {
                if (speedBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(speed_);
                } else {
                    return speedBuilder_.getMessageList();
                }
            }
            /**
             * <pre>
             * The speed information.
             * </pre>
             *
             * <code>repeated .model.traffic.SpeedWithTimeStamp speed = 2;</code>
             */
            public int getSpeedCount() {
                if (speedBuilder_ == null) {
                    return speed_.size();
                } else {
                    return speedBuilder_.getCount();
                }
            }
            /**
             * <pre>
             * The speed information.
             * </pre>
             *
             * <code>repeated .model.traffic.SpeedWithTimeStamp speed = 2;</code>
             */
            public SpeedWithTimeStamp getSpeed(int index) {
                if (speedBuilder_ == null) {
                    return speed_.get(index);
                } else {
                    return speedBuilder_.getMessage(index);
                }
            }
            /**
             * <pre>
             * The speed information.
             * </pre>
             *
             * <code>repeated .model.traffic.SpeedWithTimeStamp speed = 2;</code>
             */
            public Builder setSpeed(
                    int index, SpeedWithTimeStamp value) {
                if (speedBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureSpeedIsMutable();
                    speed_.set(index, value);
                    onChanged();
                } else {
                    speedBuilder_.setMessage(index, value);
                }
                return this;
            }
            /**
             * <pre>
             * The speed information.
             * </pre>
             *
             * <code>repeated .model.traffic.SpeedWithTimeStamp speed = 2;</code>
             */
            public Builder setSpeed(
                    int index, SpeedWithTimeStamp.Builder builderForValue) {
                if (speedBuilder_ == null) {
                    ensureSpeedIsMutable();
                    speed_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    speedBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <pre>
             * The speed information.
             * </pre>
             *
             * <code>repeated .model.traffic.SpeedWithTimeStamp speed = 2;</code>
             */
            public Builder addSpeed(SpeedWithTimeStamp value) {
                if (speedBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureSpeedIsMutable();
                    speed_.add(value);
                    onChanged();
                } else {
                    speedBuilder_.addMessage(value);
                }
                return this;
            }
            /**
             * <pre>
             * The speed information.
             * </pre>
             *
             * <code>repeated .model.traffic.SpeedWithTimeStamp speed = 2;</code>
             */
            public Builder addSpeed(
                    int index, SpeedWithTimeStamp value) {
                if (speedBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureSpeedIsMutable();
                    speed_.add(index, value);
                    onChanged();
                } else {
                    speedBuilder_.addMessage(index, value);
                }
                return this;
            }
            /**
             * <pre>
             * The speed information.
             * </pre>
             *
             * <code>repeated .model.traffic.SpeedWithTimeStamp speed = 2;</code>
             */
            public Builder addSpeed(
                    SpeedWithTimeStamp.Builder builderForValue) {
                if (speedBuilder_ == null) {
                    ensureSpeedIsMutable();
                    speed_.add(builderForValue.build());
                    onChanged();
                } else {
                    speedBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            /**
             * <pre>
             * The speed information.
             * </pre>
             *
             * <code>repeated .model.traffic.SpeedWithTimeStamp speed = 2;</code>
             */
            public Builder addSpeed(
                    int index, SpeedWithTimeStamp.Builder builderForValue) {
                if (speedBuilder_ == null) {
                    ensureSpeedIsMutable();
                    speed_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    speedBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <pre>
             * The speed information.
             * </pre>
             *
             * <code>repeated .model.traffic.SpeedWithTimeStamp speed = 2;</code>
             */
            public Builder addAllSpeed(
                    Iterable<? extends SpeedWithTimeStamp> values) {
                if (speedBuilder_ == null) {
                    ensureSpeedIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(
                            values, speed_);
                    onChanged();
                } else {
                    speedBuilder_.addAllMessages(values);
                }
                return this;
            }
            /**
             * <pre>
             * The speed information.
             * </pre>
             *
             * <code>repeated .model.traffic.SpeedWithTimeStamp speed = 2;</code>
             */
            public Builder clearSpeed() {
                if (speedBuilder_ == null) {
                    speed_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000002);
                    onChanged();
                } else {
                    speedBuilder_.clear();
                }
                return this;
            }
            /**
             * <pre>
             * The speed information.
             * </pre>
             *
             * <code>repeated .model.traffic.SpeedWithTimeStamp speed = 2;</code>
             */
            public Builder removeSpeed(int index) {
                if (speedBuilder_ == null) {
                    ensureSpeedIsMutable();
                    speed_.remove(index);
                    onChanged();
                } else {
                    speedBuilder_.remove(index);
                }
                return this;
            }
            /**
             * <pre>
             * The speed information.
             * </pre>
             *
             * <code>repeated .model.traffic.SpeedWithTimeStamp speed = 2;</code>
             */
            public SpeedWithTimeStamp.Builder getSpeedBuilder(
                    int index) {
                return getSpeedFieldBuilder().getBuilder(index);
            }
            /**
             * <pre>
             * The speed information.
             * </pre>
             *
             * <code>repeated .model.traffic.SpeedWithTimeStamp speed = 2;</code>
             */
            public SpeedWithTimeStampOrBuilder getSpeedOrBuilder(
                    int index) {
                if (speedBuilder_ == null) {
                    return speed_.get(index);  } else {
                    return speedBuilder_.getMessageOrBuilder(index);
                }
            }
            /**
             * <pre>
             * The speed information.
             * </pre>
             *
             * <code>repeated .model.traffic.SpeedWithTimeStamp speed = 2;</code>
             */
            public java.util.List<? extends SpeedWithTimeStampOrBuilder>
            getSpeedOrBuilderList() {
                if (speedBuilder_ != null) {
                    return speedBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(speed_);
                }
            }
            /**
             * <pre>
             * The speed information.
             * </pre>
             *
             * <code>repeated .model.traffic.SpeedWithTimeStamp speed = 2;</code>
             */
            public SpeedWithTimeStamp.Builder addSpeedBuilder() {
                return getSpeedFieldBuilder().addBuilder(
                        SpeedWithTimeStamp.getDefaultInstance());
            }
            /**
             * <pre>
             * The speed information.
             * </pre>
             *
             * <code>repeated .model.traffic.SpeedWithTimeStamp speed = 2;</code>
             */
            public SpeedWithTimeStamp.Builder addSpeedBuilder(
                    int index) {
                return getSpeedFieldBuilder().addBuilder(
                        index, SpeedWithTimeStamp.getDefaultInstance());
            }
            /**
             * <pre>
             * The speed information.
             * </pre>
             *
             * <code>repeated .model.traffic.SpeedWithTimeStamp speed = 2;</code>
             */
            public java.util.List<SpeedWithTimeStamp.Builder>
            getSpeedBuilderList() {
                return getSpeedFieldBuilder().getBuilderList();
            }
            private com.google.protobuf.RepeatedFieldBuilderV3<
                    SpeedWithTimeStamp, SpeedWithTimeStamp.Builder, SpeedWithTimeStampOrBuilder>
            getSpeedFieldBuilder() {
                if (speedBuilder_ == null) {
                    speedBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                            SpeedWithTimeStamp, SpeedWithTimeStamp.Builder, SpeedWithTimeStampOrBuilder>(
                            speed_,
                            ((bitField0_ & 0x00000002) == 0x00000002),
                            getParentForChildren(),
                            isClean());
                    speed_ = null;
                }
                return speedBuilder_;
            }

            private boolean roadClosure_ ;
            /**
             * <pre>
             * Flag indicating road closures.
             * </pre>
             *
             * <code>optional bool roadClosure = 3 [default = false];</code>
             */
            public boolean hasRoadClosure() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <pre>
             * Flag indicating road closures.
             * </pre>
             *
             * <code>optional bool roadClosure = 3 [default = false];</code>
             */
            public boolean getRoadClosure() {
                return roadClosure_;
            }
            /**
             * <pre>
             * Flag indicating road closures.
             * </pre>
             *
             * <code>optional bool roadClosure = 3 [default = false];</code>
             */
            public Builder setRoadClosure(boolean value) {
                bitField0_ |= 0x00000004;
                roadClosure_ = value;
                onChanged();
                return this;
            }
            /**
             * <pre>
             * Flag indicating road closures.
             * </pre>
             *
             * <code>optional bool roadClosure = 3 [default = false];</code>
             */
            public Builder clearRoadClosure() {
                bitField0_ = (bitField0_ & ~0x00000004);
                roadClosure_ = false;
                onChanged();
                return this;
            }

            private int timeToUsualInMinutes_ ;
            /**
             * <pre>
             * Expected time in minutes it takes until the current speed equals the usual speed.
             * </pre>
             *
             * <code>optional uint32 timeToUsualInMinutes = 4;</code>
             */
            public boolean hasTimeToUsualInMinutes() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }
            /**
             * <pre>
             * Expected time in minutes it takes until the current speed equals the usual speed.
             * </pre>
             *
             * <code>optional uint32 timeToUsualInMinutes = 4;</code>
             */
            public int getTimeToUsualInMinutes() {
                return timeToUsualInMinutes_;
            }
            /**
             * <pre>
             * Expected time in minutes it takes until the current speed equals the usual speed.
             * </pre>
             *
             * <code>optional uint32 timeToUsualInMinutes = 4;</code>
             */
            public Builder setTimeToUsualInMinutes(int value) {
                bitField0_ |= 0x00000008;
                timeToUsualInMinutes_ = value;
                onChanged();
                return this;
            }
            /**
             * <pre>
             * Expected time in minutes it takes until the current speed equals the usual speed.
             * </pre>
             *
             * <code>optional uint32 timeToUsualInMinutes = 4;</code>
             */
            public Builder clearTimeToUsualInMinutes() {
                bitField0_ = (bitField0_ & ~0x00000008);
                timeToUsualInMinutes_ = 0;
                onChanged();
                return this;
            }
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:model.traffic.TrafficFlowWithPrediction)
        }

        // @@protoc_insertion_point(class_scope:model.traffic.TrafficFlowWithPrediction)
        private static final TrafficFlowWithPrediction DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new TrafficFlowWithPrediction();
        }

        public static TrafficFlowWithPrediction getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @Deprecated public static final com.google.protobuf.Parser<TrafficFlowWithPrediction>
                PARSER = new com.google.protobuf.AbstractParser<TrafficFlowWithPrediction>() {
            public TrafficFlowWithPrediction parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new TrafficFlowWithPrediction(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<TrafficFlowWithPrediction> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<TrafficFlowWithPrediction> getParserForType() {
            return PARSER;
        }

        public TrafficFlowWithPrediction getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface TrafficFlowWithPredictionPerSectionOrBuilder extends
            // @@protoc_insertion_point(interface_extends:model.traffic.TrafficFlowWithPredictionPerSection)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <pre>
         * The location information.
         * </pre>
         *
         * <code>optional .model.traffic.Location location = 1;</code>
         */
        boolean hasLocation();
        /**
         * <pre>
         * The location information.
         * </pre>
         *
         * <code>optional .model.traffic.Location location = 1;</code>
         */
        Location getLocation();
        /**
         * <pre>
         * The location information.
         * </pre>
         *
         * <code>optional .model.traffic.Location location = 1;</code>
         */
        LocationOrBuilder getLocationOrBuilder();

        /**
         * <pre>
         * The speeds matrix, each speed vector provides speed parameters per section for a certain time
         * stamp in the future.
         * </pre>
         *
         * <code>repeated .model.traffic.SpeedVector speedVector = 2;</code>
         */
        java.util.List<SpeedVector>
        getSpeedVectorList();
        /**
         * <pre>
         * The speeds matrix, each speed vector provides speed parameters per section for a certain time
         * stamp in the future.
         * </pre>
         *
         * <code>repeated .model.traffic.SpeedVector speedVector = 2;</code>
         */
        SpeedVector getSpeedVector(int index);
        /**
         * <pre>
         * The speeds matrix, each speed vector provides speed parameters per section for a certain time
         * stamp in the future.
         * </pre>
         *
         * <code>repeated .model.traffic.SpeedVector speedVector = 2;</code>
         */
        int getSpeedVectorCount();
        /**
         * <pre>
         * The speeds matrix, each speed vector provides speed parameters per section for a certain time
         * stamp in the future.
         * </pre>
         *
         * <code>repeated .model.traffic.SpeedVector speedVector = 2;</code>
         */
        java.util.List<? extends SpeedVectorOrBuilder>
        getSpeedVectorOrBuilderList();
        /**
         * <pre>
         * The speeds matrix, each speed vector provides speed parameters per section for a certain time
         * stamp in the future.
         * </pre>
         *
         * <code>repeated .model.traffic.SpeedVector speedVector = 2;</code>
         */
        SpeedVectorOrBuilder getSpeedVectorOrBuilder(
                int index);

        /**
         * <pre>
         * Expected time in minutes it takes until the current speed equals the usual speed.
         * </pre>
         *
         * <code>optional uint32 timeToUsualInMinutes = 3;</code>
         */
        boolean hasTimeToUsualInMinutes();
        /**
         * <pre>
         * Expected time in minutes it takes until the current speed equals the usual speed.
         * </pre>
         *
         * <code>optional uint32 timeToUsualInMinutes = 3;</code>
         */
        int getTimeToUsualInMinutes();
    }
    /**
     * <pre>
     * A traffic flow message type dedicated for prediction with higher speed resolution.
     * The location is split into sections and speed information is assigned per section.
     * </pre>
     *
     * Protobuf type {@code model.traffic.TrafficFlowWithPredictionPerSection}
     */
    public  static final class TrafficFlowWithPredictionPerSection extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:model.traffic.TrafficFlowWithPredictionPerSection)
            TrafficFlowWithPredictionPerSectionOrBuilder {
        // Use TrafficFlowWithPredictionPerSection.newBuilder() to construct.
        private TrafficFlowWithPredictionPerSection(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private TrafficFlowWithPredictionPerSection() {
            speedVector_ = java.util.Collections.emptyList();
            timeToUsualInMinutes_ = 0;
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private TrafficFlowWithPredictionPerSection(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            Location.Builder subBuilder = null;
                            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                                subBuilder = location_.toBuilder();
                            }
                            location_ = input.readMessage(Location.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(location_);
                                location_ = subBuilder.buildPartial();
                            }
                            bitField0_ |= 0x00000001;
                            break;
                        }
                        case 18: {
                            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                                speedVector_ = new java.util.ArrayList<SpeedVector>();
                                mutable_bitField0_ |= 0x00000002;
                            }
                            speedVector_.add(
                                    input.readMessage(SpeedVector.PARSER, extensionRegistry));
                            break;
                        }
                        case 24: {
                            bitField0_ |= 0x00000002;
                            timeToUsualInMinutes_ = input.readUInt32();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                    speedVector_ = java.util.Collections.unmodifiableList(speedVector_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return ProtobufTrafficFlowV5.internal_static_model_traffic_TrafficFlowWithPredictionPerSection_descriptor;
        }

        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return ProtobufTrafficFlowV5.internal_static_model_traffic_TrafficFlowWithPredictionPerSection_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            TrafficFlowWithPredictionPerSection.class, Builder.class);
        }

        private int bitField0_;
        public static final int LOCATION_FIELD_NUMBER = 1;
        private Location location_;
        /**
         * <pre>
         * The location information.
         * </pre>
         *
         * <code>optional .model.traffic.Location location = 1;</code>
         */
        public boolean hasLocation() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <pre>
         * The location information.
         * </pre>
         *
         * <code>optional .model.traffic.Location location = 1;</code>
         */
        public Location getLocation() {
            return location_ == null ? Location.getDefaultInstance() : location_;
        }
        /**
         * <pre>
         * The location information.
         * </pre>
         *
         * <code>optional .model.traffic.Location location = 1;</code>
         */
        public LocationOrBuilder getLocationOrBuilder() {
            return location_ == null ? Location.getDefaultInstance() : location_;
        }

        public static final int SPEEDVECTOR_FIELD_NUMBER = 2;
        private java.util.List<SpeedVector> speedVector_;
        /**
         * <pre>
         * The speeds matrix, each speed vector provides speed parameters per section for a certain time
         * stamp in the future.
         * </pre>
         *
         * <code>repeated .model.traffic.SpeedVector speedVector = 2;</code>
         */
        public java.util.List<SpeedVector> getSpeedVectorList() {
            return speedVector_;
        }
        /**
         * <pre>
         * The speeds matrix, each speed vector provides speed parameters per section for a certain time
         * stamp in the future.
         * </pre>
         *
         * <code>repeated .model.traffic.SpeedVector speedVector = 2;</code>
         */
        public java.util.List<? extends SpeedVectorOrBuilder>
        getSpeedVectorOrBuilderList() {
            return speedVector_;
        }
        /**
         * <pre>
         * The speeds matrix, each speed vector provides speed parameters per section for a certain time
         * stamp in the future.
         * </pre>
         *
         * <code>repeated .model.traffic.SpeedVector speedVector = 2;</code>
         */
        public int getSpeedVectorCount() {
            return speedVector_.size();
        }
        /**
         * <pre>
         * The speeds matrix, each speed vector provides speed parameters per section for a certain time
         * stamp in the future.
         * </pre>
         *
         * <code>repeated .model.traffic.SpeedVector speedVector = 2;</code>
         */
        public SpeedVector getSpeedVector(int index) {
            return speedVector_.get(index);
        }
        /**
         * <pre>
         * The speeds matrix, each speed vector provides speed parameters per section for a certain time
         * stamp in the future.
         * </pre>
         *
         * <code>repeated .model.traffic.SpeedVector speedVector = 2;</code>
         */
        public SpeedVectorOrBuilder getSpeedVectorOrBuilder(
                int index) {
            return speedVector_.get(index);
        }

        public static final int TIMETOUSUALINMINUTES_FIELD_NUMBER = 3;
        private int timeToUsualInMinutes_;
        /**
         * <pre>
         * Expected time in minutes it takes until the current speed equals the usual speed.
         * </pre>
         *
         * <code>optional uint32 timeToUsualInMinutes = 3;</code>
         */
        public boolean hasTimeToUsualInMinutes() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <pre>
         * Expected time in minutes it takes until the current speed equals the usual speed.
         * </pre>
         *
         * <code>optional uint32 timeToUsualInMinutes = 3;</code>
         */
        public int getTimeToUsualInMinutes() {
            return timeToUsualInMinutes_;
        }

        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeMessage(1, getLocation());
            }
            for (int i = 0; i < speedVector_.size(); i++) {
                output.writeMessage(2, speedVector_.get(i));
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeUInt32(3, timeToUsualInMinutes_);
            }
            unknownFields.writeTo(output);
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(1, getLocation());
            }
            for (int i = 0; i < speedVector_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(2, speedVector_.get(i));
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(3, timeToUsualInMinutes_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TrafficFlowWithPredictionPerSection)) {
                return super.equals(obj);
            }
            TrafficFlowWithPredictionPerSection other = (TrafficFlowWithPredictionPerSection) obj;

            boolean result = true;
            result = result && (hasLocation() == other.hasLocation());
            if (hasLocation()) {
                result = result && getLocation()
                        .equals(other.getLocation());
            }
            result = result && getSpeedVectorList()
                    .equals(other.getSpeedVectorList());
            result = result && (hasTimeToUsualInMinutes() == other.hasTimeToUsualInMinutes());
            if (hasTimeToUsualInMinutes()) {
                result = result && (getTimeToUsualInMinutes()
                        == other.getTimeToUsualInMinutes());
            }
            result = result && unknownFields.equals(other.unknownFields);
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (hasLocation()) {
                hash = (37 * hash) + LOCATION_FIELD_NUMBER;
                hash = (53 * hash) + getLocation().hashCode();
            }
            if (getSpeedVectorCount() > 0) {
                hash = (37 * hash) + SPEEDVECTOR_FIELD_NUMBER;
                hash = (53 * hash) + getSpeedVectorList().hashCode();
            }
            if (hasTimeToUsualInMinutes()) {
                hash = (37 * hash) + TIMETOUSUALINMINUTES_FIELD_NUMBER;
                hash = (53 * hash) + getTimeToUsualInMinutes();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static TrafficFlowWithPredictionPerSection parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static TrafficFlowWithPredictionPerSection parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static TrafficFlowWithPredictionPerSection parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static TrafficFlowWithPredictionPerSection parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static TrafficFlowWithPredictionPerSection parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static TrafficFlowWithPredictionPerSection parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static TrafficFlowWithPredictionPerSection parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static TrafficFlowWithPredictionPerSection parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static TrafficFlowWithPredictionPerSection parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static TrafficFlowWithPredictionPerSection parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static TrafficFlowWithPredictionPerSection parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static TrafficFlowWithPredictionPerSection parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(TrafficFlowWithPredictionPerSection prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(
                BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * <pre>
         * A traffic flow message type dedicated for prediction with higher speed resolution.
         * The location is split into sections and speed information is assigned per section.
         * </pre>
         *
         * Protobuf type {@code model.traffic.TrafficFlowWithPredictionPerSection}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:model.traffic.TrafficFlowWithPredictionPerSection)
                TrafficFlowWithPredictionPerSectionOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ProtobufTrafficFlowV5.internal_static_model_traffic_TrafficFlowWithPredictionPerSection_descriptor;
            }

            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ProtobufTrafficFlowV5.internal_static_model_traffic_TrafficFlowWithPredictionPerSection_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                TrafficFlowWithPredictionPerSection.class, Builder.class);
            }

            // Construct using model.traffic.ProtobufTrafficFlowV5.TrafficFlowWithPredictionPerSection.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                    getLocationFieldBuilder();
                    getSpeedVectorFieldBuilder();
                }
            }
            public Builder clear() {
                super.clear();
                if (locationBuilder_ == null) {
                    location_ = null;
                } else {
                    locationBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000001);
                if (speedVectorBuilder_ == null) {
                    speedVector_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000002);
                } else {
                    speedVectorBuilder_.clear();
                }
                timeToUsualInMinutes_ = 0;
                bitField0_ = (bitField0_ & ~0x00000004);
                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return ProtobufTrafficFlowV5.internal_static_model_traffic_TrafficFlowWithPredictionPerSection_descriptor;
            }

            public TrafficFlowWithPredictionPerSection getDefaultInstanceForType() {
                return TrafficFlowWithPredictionPerSection.getDefaultInstance();
            }

            public TrafficFlowWithPredictionPerSection build() {
                TrafficFlowWithPredictionPerSection result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public TrafficFlowWithPredictionPerSection buildPartial() {
                TrafficFlowWithPredictionPerSection result = new TrafficFlowWithPredictionPerSection(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                if (locationBuilder_ == null) {
                    result.location_ = location_;
                } else {
                    result.location_ = locationBuilder_.build();
                }
                if (speedVectorBuilder_ == null) {
                    if (((bitField0_ & 0x00000002) == 0x00000002)) {
                        speedVector_ = java.util.Collections.unmodifiableList(speedVector_);
                        bitField0_ = (bitField0_ & ~0x00000002);
                    }
                    result.speedVector_ = speedVector_;
                } else {
                    result.speedVector_ = speedVectorBuilder_.build();
                }
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.timeToUsualInMinutes_ = timeToUsualInMinutes_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof TrafficFlowWithPredictionPerSection) {
                    return mergeFrom((TrafficFlowWithPredictionPerSection)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(TrafficFlowWithPredictionPerSection other) {
                if (other == TrafficFlowWithPredictionPerSection.getDefaultInstance()) return this;
                if (other.hasLocation()) {
                    mergeLocation(other.getLocation());
                }
                if (speedVectorBuilder_ == null) {
                    if (!other.speedVector_.isEmpty()) {
                        if (speedVector_.isEmpty()) {
                            speedVector_ = other.speedVector_;
                            bitField0_ = (bitField0_ & ~0x00000002);
                        } else {
                            ensureSpeedVectorIsMutable();
                            speedVector_.addAll(other.speedVector_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.speedVector_.isEmpty()) {
                        if (speedVectorBuilder_.isEmpty()) {
                            speedVectorBuilder_.dispose();
                            speedVectorBuilder_ = null;
                            speedVector_ = other.speedVector_;
                            bitField0_ = (bitField0_ & ~0x00000002);
                            speedVectorBuilder_ =
                                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                            getSpeedVectorFieldBuilder() : null;
                        } else {
                            speedVectorBuilder_.addAllMessages(other.speedVector_);
                        }
                    }
                }
                if (other.hasTimeToUsualInMinutes()) {
                    setTimeToUsualInMinutes(other.getTimeToUsualInMinutes());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                TrafficFlowWithPredictionPerSection parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (TrafficFlowWithPredictionPerSection) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            private Location location_ = null;
            private com.google.protobuf.SingleFieldBuilderV3<
                    Location, Location.Builder, LocationOrBuilder> locationBuilder_;
            /**
             * <pre>
             * The location information.
             * </pre>
             *
             * <code>optional .model.traffic.Location location = 1;</code>
             */
            public boolean hasLocation() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <pre>
             * The location information.
             * </pre>
             *
             * <code>optional .model.traffic.Location location = 1;</code>
             */
            public Location getLocation() {
                if (locationBuilder_ == null) {
                    return location_ == null ? Location.getDefaultInstance() : location_;
                } else {
                    return locationBuilder_.getMessage();
                }
            }
            /**
             * <pre>
             * The location information.
             * </pre>
             *
             * <code>optional .model.traffic.Location location = 1;</code>
             */
            public Builder setLocation(Location value) {
                if (locationBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    location_ = value;
                    onChanged();
                } else {
                    locationBuilder_.setMessage(value);
                }
                bitField0_ |= 0x00000001;
                return this;
            }
            /**
             * <pre>
             * The location information.
             * </pre>
             *
             * <code>optional .model.traffic.Location location = 1;</code>
             */
            public Builder setLocation(
                    Location.Builder builderForValue) {
                if (locationBuilder_ == null) {
                    location_ = builderForValue.build();
                    onChanged();
                } else {
                    locationBuilder_.setMessage(builderForValue.build());
                }
                bitField0_ |= 0x00000001;
                return this;
            }
            /**
             * <pre>
             * The location information.
             * </pre>
             *
             * <code>optional .model.traffic.Location location = 1;</code>
             */
            public Builder mergeLocation(Location value) {
                if (locationBuilder_ == null) {
                    if (((bitField0_ & 0x00000001) == 0x00000001) &&
                            location_ != null &&
                            location_ != Location.getDefaultInstance()) {
                        location_ =
                                Location.newBuilder(location_).mergeFrom(value).buildPartial();
                    } else {
                        location_ = value;
                    }
                    onChanged();
                } else {
                    locationBuilder_.mergeFrom(value);
                }
                bitField0_ |= 0x00000001;
                return this;
            }
            /**
             * <pre>
             * The location information.
             * </pre>
             *
             * <code>optional .model.traffic.Location location = 1;</code>
             */
            public Builder clearLocation() {
                if (locationBuilder_ == null) {
                    location_ = null;
                    onChanged();
                } else {
                    locationBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000001);
                return this;
            }
            /**
             * <pre>
             * The location information.
             * </pre>
             *
             * <code>optional .model.traffic.Location location = 1;</code>
             */
            public Location.Builder getLocationBuilder() {
                bitField0_ |= 0x00000001;
                onChanged();
                return getLocationFieldBuilder().getBuilder();
            }
            /**
             * <pre>
             * The location information.
             * </pre>
             *
             * <code>optional .model.traffic.Location location = 1;</code>
             */
            public LocationOrBuilder getLocationOrBuilder() {
                if (locationBuilder_ != null) {
                    return locationBuilder_.getMessageOrBuilder();
                } else {
                    return location_ == null ?
                            Location.getDefaultInstance() : location_;
                }
            }
            /**
             * <pre>
             * The location information.
             * </pre>
             *
             * <code>optional .model.traffic.Location location = 1;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    Location, Location.Builder, LocationOrBuilder>
            getLocationFieldBuilder() {
                if (locationBuilder_ == null) {
                    locationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            Location, Location.Builder, LocationOrBuilder>(
                            getLocation(),
                            getParentForChildren(),
                            isClean());
                    location_ = null;
                }
                return locationBuilder_;
            }

            private java.util.List<SpeedVector> speedVector_ =
                    java.util.Collections.emptyList();
            private void ensureSpeedVectorIsMutable() {
                if (!((bitField0_ & 0x00000002) == 0x00000002)) {
                    speedVector_ = new java.util.ArrayList<SpeedVector>(speedVector_);
                    bitField0_ |= 0x00000002;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    SpeedVector, SpeedVector.Builder, SpeedVectorOrBuilder> speedVectorBuilder_;

            /**
             * <pre>
             * The speeds matrix, each speed vector provides speed parameters per section for a certain time
             * stamp in the future.
             * </pre>
             *
             * <code>repeated .model.traffic.SpeedVector speedVector = 2;</code>
             */
            public java.util.List<SpeedVector> getSpeedVectorList() {
                if (speedVectorBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(speedVector_);
                } else {
                    return speedVectorBuilder_.getMessageList();
                }
            }
            /**
             * <pre>
             * The speeds matrix, each speed vector provides speed parameters per section for a certain time
             * stamp in the future.
             * </pre>
             *
             * <code>repeated .model.traffic.SpeedVector speedVector = 2;</code>
             */
            public int getSpeedVectorCount() {
                if (speedVectorBuilder_ == null) {
                    return speedVector_.size();
                } else {
                    return speedVectorBuilder_.getCount();
                }
            }
            /**
             * <pre>
             * The speeds matrix, each speed vector provides speed parameters per section for a certain time
             * stamp in the future.
             * </pre>
             *
             * <code>repeated .model.traffic.SpeedVector speedVector = 2;</code>
             */
            public SpeedVector getSpeedVector(int index) {
                if (speedVectorBuilder_ == null) {
                    return speedVector_.get(index);
                } else {
                    return speedVectorBuilder_.getMessage(index);
                }
            }
            /**
             * <pre>
             * The speeds matrix, each speed vector provides speed parameters per section for a certain time
             * stamp in the future.
             * </pre>
             *
             * <code>repeated .model.traffic.SpeedVector speedVector = 2;</code>
             */
            public Builder setSpeedVector(
                    int index, SpeedVector value) {
                if (speedVectorBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureSpeedVectorIsMutable();
                    speedVector_.set(index, value);
                    onChanged();
                } else {
                    speedVectorBuilder_.setMessage(index, value);
                }
                return this;
            }
            /**
             * <pre>
             * The speeds matrix, each speed vector provides speed parameters per section for a certain time
             * stamp in the future.
             * </pre>
             *
             * <code>repeated .model.traffic.SpeedVector speedVector = 2;</code>
             */
            public Builder setSpeedVector(
                    int index, SpeedVector.Builder builderForValue) {
                if (speedVectorBuilder_ == null) {
                    ensureSpeedVectorIsMutable();
                    speedVector_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    speedVectorBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <pre>
             * The speeds matrix, each speed vector provides speed parameters per section for a certain time
             * stamp in the future.
             * </pre>
             *
             * <code>repeated .model.traffic.SpeedVector speedVector = 2;</code>
             */
            public Builder addSpeedVector(SpeedVector value) {
                if (speedVectorBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureSpeedVectorIsMutable();
                    speedVector_.add(value);
                    onChanged();
                } else {
                    speedVectorBuilder_.addMessage(value);
                }
                return this;
            }
            /**
             * <pre>
             * The speeds matrix, each speed vector provides speed parameters per section for a certain time
             * stamp in the future.
             * </pre>
             *
             * <code>repeated .model.traffic.SpeedVector speedVector = 2;</code>
             */
            public Builder addSpeedVector(
                    int index, SpeedVector value) {
                if (speedVectorBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureSpeedVectorIsMutable();
                    speedVector_.add(index, value);
                    onChanged();
                } else {
                    speedVectorBuilder_.addMessage(index, value);
                }
                return this;
            }
            /**
             * <pre>
             * The speeds matrix, each speed vector provides speed parameters per section for a certain time
             * stamp in the future.
             * </pre>
             *
             * <code>repeated .model.traffic.SpeedVector speedVector = 2;</code>
             */
            public Builder addSpeedVector(
                    SpeedVector.Builder builderForValue) {
                if (speedVectorBuilder_ == null) {
                    ensureSpeedVectorIsMutable();
                    speedVector_.add(builderForValue.build());
                    onChanged();
                } else {
                    speedVectorBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            /**
             * <pre>
             * The speeds matrix, each speed vector provides speed parameters per section for a certain time
             * stamp in the future.
             * </pre>
             *
             * <code>repeated .model.traffic.SpeedVector speedVector = 2;</code>
             */
            public Builder addSpeedVector(
                    int index, SpeedVector.Builder builderForValue) {
                if (speedVectorBuilder_ == null) {
                    ensureSpeedVectorIsMutable();
                    speedVector_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    speedVectorBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <pre>
             * The speeds matrix, each speed vector provides speed parameters per section for a certain time
             * stamp in the future.
             * </pre>
             *
             * <code>repeated .model.traffic.SpeedVector speedVector = 2;</code>
             */
            public Builder addAllSpeedVector(
                    Iterable<? extends SpeedVector> values) {
                if (speedVectorBuilder_ == null) {
                    ensureSpeedVectorIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(
                            values, speedVector_);
                    onChanged();
                } else {
                    speedVectorBuilder_.addAllMessages(values);
                }
                return this;
            }
            /**
             * <pre>
             * The speeds matrix, each speed vector provides speed parameters per section for a certain time
             * stamp in the future.
             * </pre>
             *
             * <code>repeated .model.traffic.SpeedVector speedVector = 2;</code>
             */
            public Builder clearSpeedVector() {
                if (speedVectorBuilder_ == null) {
                    speedVector_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000002);
                    onChanged();
                } else {
                    speedVectorBuilder_.clear();
                }
                return this;
            }
            /**
             * <pre>
             * The speeds matrix, each speed vector provides speed parameters per section for a certain time
             * stamp in the future.
             * </pre>
             *
             * <code>repeated .model.traffic.SpeedVector speedVector = 2;</code>
             */
            public Builder removeSpeedVector(int index) {
                if (speedVectorBuilder_ == null) {
                    ensureSpeedVectorIsMutable();
                    speedVector_.remove(index);
                    onChanged();
                } else {
                    speedVectorBuilder_.remove(index);
                }
                return this;
            }
            /**
             * <pre>
             * The speeds matrix, each speed vector provides speed parameters per section for a certain time
             * stamp in the future.
             * </pre>
             *
             * <code>repeated .model.traffic.SpeedVector speedVector = 2;</code>
             */
            public SpeedVector.Builder getSpeedVectorBuilder(
                    int index) {
                return getSpeedVectorFieldBuilder().getBuilder(index);
            }
            /**
             * <pre>
             * The speeds matrix, each speed vector provides speed parameters per section for a certain time
             * stamp in the future.
             * </pre>
             *
             * <code>repeated .model.traffic.SpeedVector speedVector = 2;</code>
             */
            public SpeedVectorOrBuilder getSpeedVectorOrBuilder(
                    int index) {
                if (speedVectorBuilder_ == null) {
                    return speedVector_.get(index);  } else {
                    return speedVectorBuilder_.getMessageOrBuilder(index);
                }
            }
            /**
             * <pre>
             * The speeds matrix, each speed vector provides speed parameters per section for a certain time
             * stamp in the future.
             * </pre>
             *
             * <code>repeated .model.traffic.SpeedVector speedVector = 2;</code>
             */
            public java.util.List<? extends SpeedVectorOrBuilder>
            getSpeedVectorOrBuilderList() {
                if (speedVectorBuilder_ != null) {
                    return speedVectorBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(speedVector_);
                }
            }
            /**
             * <pre>
             * The speeds matrix, each speed vector provides speed parameters per section for a certain time
             * stamp in the future.
             * </pre>
             *
             * <code>repeated .model.traffic.SpeedVector speedVector = 2;</code>
             */
            public SpeedVector.Builder addSpeedVectorBuilder() {
                return getSpeedVectorFieldBuilder().addBuilder(
                        SpeedVector.getDefaultInstance());
            }
            /**
             * <pre>
             * The speeds matrix, each speed vector provides speed parameters per section for a certain time
             * stamp in the future.
             * </pre>
             *
             * <code>repeated .model.traffic.SpeedVector speedVector = 2;</code>
             */
            public SpeedVector.Builder addSpeedVectorBuilder(
                    int index) {
                return getSpeedVectorFieldBuilder().addBuilder(
                        index, SpeedVector.getDefaultInstance());
            }
            /**
             * <pre>
             * The speeds matrix, each speed vector provides speed parameters per section for a certain time
             * stamp in the future.
             * </pre>
             *
             * <code>repeated .model.traffic.SpeedVector speedVector = 2;</code>
             */
            public java.util.List<SpeedVector.Builder>
            getSpeedVectorBuilderList() {
                return getSpeedVectorFieldBuilder().getBuilderList();
            }
            private com.google.protobuf.RepeatedFieldBuilderV3<
                    SpeedVector, SpeedVector.Builder, SpeedVectorOrBuilder>
            getSpeedVectorFieldBuilder() {
                if (speedVectorBuilder_ == null) {
                    speedVectorBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                            SpeedVector, SpeedVector.Builder, SpeedVectorOrBuilder>(
                            speedVector_,
                            ((bitField0_ & 0x00000002) == 0x00000002),
                            getParentForChildren(),
                            isClean());
                    speedVector_ = null;
                }
                return speedVectorBuilder_;
            }

            private int timeToUsualInMinutes_ ;
            /**
             * <pre>
             * Expected time in minutes it takes until the current speed equals the usual speed.
             * </pre>
             *
             * <code>optional uint32 timeToUsualInMinutes = 3;</code>
             */
            public boolean hasTimeToUsualInMinutes() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <pre>
             * Expected time in minutes it takes until the current speed equals the usual speed.
             * </pre>
             *
             * <code>optional uint32 timeToUsualInMinutes = 3;</code>
             */
            public int getTimeToUsualInMinutes() {
                return timeToUsualInMinutes_;
            }
            /**
             * <pre>
             * Expected time in minutes it takes until the current speed equals the usual speed.
             * </pre>
             *
             * <code>optional uint32 timeToUsualInMinutes = 3;</code>
             */
            public Builder setTimeToUsualInMinutes(int value) {
                bitField0_ |= 0x00000004;
                timeToUsualInMinutes_ = value;
                onChanged();
                return this;
            }
            /**
             * <pre>
             * Expected time in minutes it takes until the current speed equals the usual speed.
             * </pre>
             *
             * <code>optional uint32 timeToUsualInMinutes = 3;</code>
             */
            public Builder clearTimeToUsualInMinutes() {
                bitField0_ = (bitField0_ & ~0x00000004);
                timeToUsualInMinutes_ = 0;
                onChanged();
                return this;
            }
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:model.traffic.TrafficFlowWithPredictionPerSection)
        }

        // @@protoc_insertion_point(class_scope:model.traffic.TrafficFlowWithPredictionPerSection)
        private static final TrafficFlowWithPredictionPerSection DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new TrafficFlowWithPredictionPerSection();
        }

        public static TrafficFlowWithPredictionPerSection getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @Deprecated public static final com.google.protobuf.Parser<TrafficFlowWithPredictionPerSection>
                PARSER = new com.google.protobuf.AbstractParser<TrafficFlowWithPredictionPerSection>() {
            public TrafficFlowWithPredictionPerSection parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new TrafficFlowWithPredictionPerSection(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<TrafficFlowWithPredictionPerSection> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<TrafficFlowWithPredictionPerSection> getParserForType() {
            return PARSER;
        }

        public TrafficFlowWithPredictionPerSection getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface LocationOrBuilder extends
            // @@protoc_insertion_point(interface_extends:model.traffic.Location)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <pre>
         * The TMC location reference.
         * It is composed of the following parts: CVVDLLLLL[xE[E]]
         *        C - hexadecimal country code as described in IEC 62106
         *       VV - TMC location table number
         *        D - TMC direction of the chain (direction of travel and NOT the
         *             direction of queue growth as in RDS-TMC!). Possible values:
         *             'P': positive direction, internal links only
         *             '+': positive direction, external links only
         *             'p': positive direction, internal + external links
         *             'N': negative direction, internal links only
         *             '-': negative direction, external links only
         *             'n': negative direction, internal + external links
         *    LLLLL - TMC point location code.  If the number is not 5 digits
         *             long, zeros will be added up to 5 characters at the
         *             beginning of the code.
         *  [xE[E]] - Either empty, when extent = 1, or fixed letter 'x' followed
         *             by the extent (1 or 2 digits).
         * </pre>
         *
         * <code>optional string tmc = 1;</code>
         */
        boolean hasTmc();
        /**
         * <pre>
         * The TMC location reference.
         * It is composed of the following parts: CVVDLLLLL[xE[E]]
         *        C - hexadecimal country code as described in IEC 62106
         *       VV - TMC location table number
         *        D - TMC direction of the chain (direction of travel and NOT the
         *             direction of queue growth as in RDS-TMC!). Possible values:
         *             'P': positive direction, internal links only
         *             '+': positive direction, external links only
         *             'p': positive direction, internal + external links
         *             'N': negative direction, internal links only
         *             '-': negative direction, external links only
         *             'n': negative direction, internal + external links
         *    LLLLL - TMC point location code.  If the number is not 5 digits
         *             long, zeros will be added up to 5 characters at the
         *             beginning of the code.
         *  [xE[E]] - Either empty, when extent = 1, or fixed letter 'x' followed
         *             by the extent (1 or 2 digits).
         * </pre>
         *
         * <code>optional string tmc = 1;</code>
         */
        String getTmc();
        /**
         * <pre>
         * The TMC location reference.
         * It is composed of the following parts: CVVDLLLLL[xE[E]]
         *        C - hexadecimal country code as described in IEC 62106
         *       VV - TMC location table number
         *        D - TMC direction of the chain (direction of travel and NOT the
         *             direction of queue growth as in RDS-TMC!). Possible values:
         *             'P': positive direction, internal links only
         *             '+': positive direction, external links only
         *             'p': positive direction, internal + external links
         *             'N': negative direction, internal links only
         *             '-': negative direction, external links only
         *             'n': negative direction, internal + external links
         *    LLLLL - TMC point location code.  If the number is not 5 digits
         *             long, zeros will be added up to 5 characters at the
         *             beginning of the code.
         *  [xE[E]] - Either empty, when extent = 1, or fixed letter 'x' followed
         *             by the extent (1 or 2 digits).
         * </pre>
         *
         * <code>optional string tmc = 1;</code>
         */
        com.google.protobuf.ByteString
        getTmcBytes();

        /**
         * <pre>
         * The binary OpenLR location reference.
         * </pre>
         *
         * <code>optional bytes openlr = 2;</code>
         */
        boolean hasOpenlr();
        /**
         * <pre>
         * The binary OpenLR location reference.
         * </pre>
         *
         * <code>optional bytes openlr = 2;</code>
         */
        com.google.protobuf.ByteString getOpenlr();

        /**
         * <pre>
         * Length of location in meters.
         * </pre>
         *
         * <code>optional uint32 lengthInMeters = 3;</code>
         */
        boolean hasLengthInMeters();
        /**
         * <pre>
         * Length of location in meters.
         * </pre>
         *
         * <code>optional uint32 lengthInMeters = 3;</code>
         */
        int getLengthInMeters();
    }
    /**
     * <pre>
     * The location message provides all kind of supported location referencing
     * methods.
     * </pre>
     *
     * Protobuf type {@code model.traffic.Location}
     */
    public  static final class Location extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:model.traffic.Location)
            LocationOrBuilder {
        // Use Location.newBuilder() to construct.
        private Location(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private Location() {
            tmc_ = "";
            openlr_ = com.google.protobuf.ByteString.EMPTY;
            lengthInMeters_ = 0;
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private Location(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 10: {
                            com.google.protobuf.ByteString bs = input.readBytes();
                            bitField0_ |= 0x00000001;
                            tmc_ = bs;
                            break;
                        }
                        case 18: {
                            bitField0_ |= 0x00000002;
                            openlr_ = input.readBytes();
                            break;
                        }
                        case 24: {
                            bitField0_ |= 0x00000004;
                            lengthInMeters_ = input.readUInt32();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return ProtobufTrafficFlowV5.internal_static_model_traffic_Location_descriptor;
        }

        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return ProtobufTrafficFlowV5.internal_static_model_traffic_Location_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            Location.class, Builder.class);
        }

        private int bitField0_;
        public static final int TMC_FIELD_NUMBER = 1;
        private volatile Object tmc_;
        /**
         * <pre>
         * The TMC location reference.
         * It is composed of the following parts: CVVDLLLLL[xE[E]]
         *        C - hexadecimal country code as described in IEC 62106
         *       VV - TMC location table number
         *        D - TMC direction of the chain (direction of travel and NOT the
         *             direction of queue growth as in RDS-TMC!). Possible values:
         *             'P': positive direction, internal links only
         *             '+': positive direction, external links only
         *             'p': positive direction, internal + external links
         *             'N': negative direction, internal links only
         *             '-': negative direction, external links only
         *             'n': negative direction, internal + external links
         *    LLLLL - TMC point location code.  If the number is not 5 digits
         *             long, zeros will be added up to 5 characters at the
         *             beginning of the code.
         *  [xE[E]] - Either empty, when extent = 1, or fixed letter 'x' followed
         *             by the extent (1 or 2 digits).
         * </pre>
         *
         * <code>optional string tmc = 1;</code>
         */
        public boolean hasTmc() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <pre>
         * The TMC location reference.
         * It is composed of the following parts: CVVDLLLLL[xE[E]]
         *        C - hexadecimal country code as described in IEC 62106
         *       VV - TMC location table number
         *        D - TMC direction of the chain (direction of travel and NOT the
         *             direction of queue growth as in RDS-TMC!). Possible values:
         *             'P': positive direction, internal links only
         *             '+': positive direction, external links only
         *             'p': positive direction, internal + external links
         *             'N': negative direction, internal links only
         *             '-': negative direction, external links only
         *             'n': negative direction, internal + external links
         *    LLLLL - TMC point location code.  If the number is not 5 digits
         *             long, zeros will be added up to 5 characters at the
         *             beginning of the code.
         *  [xE[E]] - Either empty, when extent = 1, or fixed letter 'x' followed
         *             by the extent (1 or 2 digits).
         * </pre>
         *
         * <code>optional string tmc = 1;</code>
         */
        public String getTmc() {
            Object ref = tmc_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    tmc_ = s;
                }
                return s;
            }
        }
        /**
         * <pre>
         * The TMC location reference.
         * It is composed of the following parts: CVVDLLLLL[xE[E]]
         *        C - hexadecimal country code as described in IEC 62106
         *       VV - TMC location table number
         *        D - TMC direction of the chain (direction of travel and NOT the
         *             direction of queue growth as in RDS-TMC!). Possible values:
         *             'P': positive direction, internal links only
         *             '+': positive direction, external links only
         *             'p': positive direction, internal + external links
         *             'N': negative direction, internal links only
         *             '-': negative direction, external links only
         *             'n': negative direction, internal + external links
         *    LLLLL - TMC point location code.  If the number is not 5 digits
         *             long, zeros will be added up to 5 characters at the
         *             beginning of the code.
         *  [xE[E]] - Either empty, when extent = 1, or fixed letter 'x' followed
         *             by the extent (1 or 2 digits).
         * </pre>
         *
         * <code>optional string tmc = 1;</code>
         */
        public com.google.protobuf.ByteString
        getTmcBytes() {
            Object ref = tmc_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                tmc_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int OPENLR_FIELD_NUMBER = 2;
        private com.google.protobuf.ByteString openlr_;
        /**
         * <pre>
         * The binary OpenLR location reference.
         * </pre>
         *
         * <code>optional bytes openlr = 2;</code>
         */
        public boolean hasOpenlr() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <pre>
         * The binary OpenLR location reference.
         * </pre>
         *
         * <code>optional bytes openlr = 2;</code>
         */
        public com.google.protobuf.ByteString getOpenlr() {
            return openlr_;
        }

        public static final int LENGTHINMETERS_FIELD_NUMBER = 3;
        private int lengthInMeters_;
        /**
         * <pre>
         * Length of location in meters.
         * </pre>
         *
         * <code>optional uint32 lengthInMeters = 3;</code>
         */
        public boolean hasLengthInMeters() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <pre>
         * Length of location in meters.
         * </pre>
         *
         * <code>optional uint32 lengthInMeters = 3;</code>
         */
        public int getLengthInMeters() {
            return lengthInMeters_;
        }

        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, tmc_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeBytes(2, openlr_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeUInt32(3, lengthInMeters_);
            }
            unknownFields.writeTo(output);
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, tmc_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(2, openlr_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(3, lengthInMeters_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Location)) {
                return super.equals(obj);
            }
            Location other = (Location) obj;

            boolean result = true;
            result = result && (hasTmc() == other.hasTmc());
            if (hasTmc()) {
                result = result && getTmc()
                        .equals(other.getTmc());
            }
            result = result && (hasOpenlr() == other.hasOpenlr());
            if (hasOpenlr()) {
                result = result && getOpenlr()
                        .equals(other.getOpenlr());
            }
            result = result && (hasLengthInMeters() == other.hasLengthInMeters());
            if (hasLengthInMeters()) {
                result = result && (getLengthInMeters()
                        == other.getLengthInMeters());
            }
            result = result && unknownFields.equals(other.unknownFields);
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (hasTmc()) {
                hash = (37 * hash) + TMC_FIELD_NUMBER;
                hash = (53 * hash) + getTmc().hashCode();
            }
            if (hasOpenlr()) {
                hash = (37 * hash) + OPENLR_FIELD_NUMBER;
                hash = (53 * hash) + getOpenlr().hashCode();
            }
            if (hasLengthInMeters()) {
                hash = (37 * hash) + LENGTHINMETERS_FIELD_NUMBER;
                hash = (53 * hash) + getLengthInMeters();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static Location parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static Location parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Location parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static Location parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Location parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static Location parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Location parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static Location parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static Location parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static Location parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static Location parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static Location parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(Location prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(
                BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * <pre>
         * The location message provides all kind of supported location referencing
         * methods.
         * </pre>
         *
         * Protobuf type {@code model.traffic.Location}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:model.traffic.Location)
                LocationOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ProtobufTrafficFlowV5.internal_static_model_traffic_Location_descriptor;
            }

            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ProtobufTrafficFlowV5.internal_static_model_traffic_Location_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                Location.class, Builder.class);
            }

            // Construct using model.traffic.ProtobufTrafficFlowV5.Location.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }
            public Builder clear() {
                super.clear();
                tmc_ = "";
                bitField0_ = (bitField0_ & ~0x00000001);
                openlr_ = com.google.protobuf.ByteString.EMPTY;
                bitField0_ = (bitField0_ & ~0x00000002);
                lengthInMeters_ = 0;
                bitField0_ = (bitField0_ & ~0x00000004);
                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return ProtobufTrafficFlowV5.internal_static_model_traffic_Location_descriptor;
            }

            public Location getDefaultInstanceForType() {
                return Location.getDefaultInstance();
            }

            public Location build() {
                Location result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public Location buildPartial() {
                Location result = new Location(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.tmc_ = tmc_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.openlr_ = openlr_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.lengthInMeters_ = lengthInMeters_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof Location) {
                    return mergeFrom((Location)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(Location other) {
                if (other == Location.getDefaultInstance()) return this;
                if (other.hasTmc()) {
                    bitField0_ |= 0x00000001;
                    tmc_ = other.tmc_;
                    onChanged();
                }
                if (other.hasOpenlr()) {
                    setOpenlr(other.getOpenlr());
                }
                if (other.hasLengthInMeters()) {
                    setLengthInMeters(other.getLengthInMeters());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                Location parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (Location) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            private Object tmc_ = "";
            /**
             * <pre>
             * The TMC location reference.
             * It is composed of the following parts: CVVDLLLLL[xE[E]]
             *        C - hexadecimal country code as described in IEC 62106
             *       VV - TMC location table number
             *        D - TMC direction of the chain (direction of travel and NOT the
             *             direction of queue growth as in RDS-TMC!). Possible values:
             *             'P': positive direction, internal links only
             *             '+': positive direction, external links only
             *             'p': positive direction, internal + external links
             *             'N': negative direction, internal links only
             *             '-': negative direction, external links only
             *             'n': negative direction, internal + external links
             *    LLLLL - TMC point location code.  If the number is not 5 digits
             *             long, zeros will be added up to 5 characters at the
             *             beginning of the code.
             *  [xE[E]] - Either empty, when extent = 1, or fixed letter 'x' followed
             *             by the extent (1 or 2 digits).
             * </pre>
             *
             * <code>optional string tmc = 1;</code>
             */
            public boolean hasTmc() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <pre>
             * The TMC location reference.
             * It is composed of the following parts: CVVDLLLLL[xE[E]]
             *        C - hexadecimal country code as described in IEC 62106
             *       VV - TMC location table number
             *        D - TMC direction of the chain (direction of travel and NOT the
             *             direction of queue growth as in RDS-TMC!). Possible values:
             *             'P': positive direction, internal links only
             *             '+': positive direction, external links only
             *             'p': positive direction, internal + external links
             *             'N': negative direction, internal links only
             *             '-': negative direction, external links only
             *             'n': negative direction, internal + external links
             *    LLLLL - TMC point location code.  If the number is not 5 digits
             *             long, zeros will be added up to 5 characters at the
             *             beginning of the code.
             *  [xE[E]] - Either empty, when extent = 1, or fixed letter 'x' followed
             *             by the extent (1 or 2 digits).
             * </pre>
             *
             * <code>optional string tmc = 1;</code>
             */
            public String getTmc() {
                Object ref = tmc_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        tmc_ = s;
                    }
                    return s;
                } else {
                    return (String) ref;
                }
            }
            /**
             * <pre>
             * The TMC location reference.
             * It is composed of the following parts: CVVDLLLLL[xE[E]]
             *        C - hexadecimal country code as described in IEC 62106
             *       VV - TMC location table number
             *        D - TMC direction of the chain (direction of travel and NOT the
             *             direction of queue growth as in RDS-TMC!). Possible values:
             *             'P': positive direction, internal links only
             *             '+': positive direction, external links only
             *             'p': positive direction, internal + external links
             *             'N': negative direction, internal links only
             *             '-': negative direction, external links only
             *             'n': negative direction, internal + external links
             *    LLLLL - TMC point location code.  If the number is not 5 digits
             *             long, zeros will be added up to 5 characters at the
             *             beginning of the code.
             *  [xE[E]] - Either empty, when extent = 1, or fixed letter 'x' followed
             *             by the extent (1 or 2 digits).
             * </pre>
             *
             * <code>optional string tmc = 1;</code>
             */
            public com.google.protobuf.ByteString
            getTmcBytes() {
                Object ref = tmc_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    tmc_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <pre>
             * The TMC location reference.
             * It is composed of the following parts: CVVDLLLLL[xE[E]]
             *        C - hexadecimal country code as described in IEC 62106
             *       VV - TMC location table number
             *        D - TMC direction of the chain (direction of travel and NOT the
             *             direction of queue growth as in RDS-TMC!). Possible values:
             *             'P': positive direction, internal links only
             *             '+': positive direction, external links only
             *             'p': positive direction, internal + external links
             *             'N': negative direction, internal links only
             *             '-': negative direction, external links only
             *             'n': negative direction, internal + external links
             *    LLLLL - TMC point location code.  If the number is not 5 digits
             *             long, zeros will be added up to 5 characters at the
             *             beginning of the code.
             *  [xE[E]] - Either empty, when extent = 1, or fixed letter 'x' followed
             *             by the extent (1 or 2 digits).
             * </pre>
             *
             * <code>optional string tmc = 1;</code>
             */
            public Builder setTmc(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                tmc_ = value;
                onChanged();
                return this;
            }
            /**
             * <pre>
             * The TMC location reference.
             * It is composed of the following parts: CVVDLLLLL[xE[E]]
             *        C - hexadecimal country code as described in IEC 62106
             *       VV - TMC location table number
             *        D - TMC direction of the chain (direction of travel and NOT the
             *             direction of queue growth as in RDS-TMC!). Possible values:
             *             'P': positive direction, internal links only
             *             '+': positive direction, external links only
             *             'p': positive direction, internal + external links
             *             'N': negative direction, internal links only
             *             '-': negative direction, external links only
             *             'n': negative direction, internal + external links
             *    LLLLL - TMC point location code.  If the number is not 5 digits
             *             long, zeros will be added up to 5 characters at the
             *             beginning of the code.
             *  [xE[E]] - Either empty, when extent = 1, or fixed letter 'x' followed
             *             by the extent (1 or 2 digits).
             * </pre>
             *
             * <code>optional string tmc = 1;</code>
             */
            public Builder clearTmc() {
                bitField0_ = (bitField0_ & ~0x00000001);
                tmc_ = getDefaultInstance().getTmc();
                onChanged();
                return this;
            }
            /**
             * <pre>
             * The TMC location reference.
             * It is composed of the following parts: CVVDLLLLL[xE[E]]
             *        C - hexadecimal country code as described in IEC 62106
             *       VV - TMC location table number
             *        D - TMC direction of the chain (direction of travel and NOT the
             *             direction of queue growth as in RDS-TMC!). Possible values:
             *             'P': positive direction, internal links only
             *             '+': positive direction, external links only
             *             'p': positive direction, internal + external links
             *             'N': negative direction, internal links only
             *             '-': negative direction, external links only
             *             'n': negative direction, internal + external links
             *    LLLLL - TMC point location code.  If the number is not 5 digits
             *             long, zeros will be added up to 5 characters at the
             *             beginning of the code.
             *  [xE[E]] - Either empty, when extent = 1, or fixed letter 'x' followed
             *             by the extent (1 or 2 digits).
             * </pre>
             *
             * <code>optional string tmc = 1;</code>
             */
            public Builder setTmcBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                tmc_ = value;
                onChanged();
                return this;
            }

            private com.google.protobuf.ByteString openlr_ = com.google.protobuf.ByteString.EMPTY;
            /**
             * <pre>
             * The binary OpenLR location reference.
             * </pre>
             *
             * <code>optional bytes openlr = 2;</code>
             */
            public boolean hasOpenlr() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <pre>
             * The binary OpenLR location reference.
             * </pre>
             *
             * <code>optional bytes openlr = 2;</code>
             */
            public com.google.protobuf.ByteString getOpenlr() {
                return openlr_;
            }
            /**
             * <pre>
             * The binary OpenLR location reference.
             * </pre>
             *
             * <code>optional bytes openlr = 2;</code>
             */
            public Builder setOpenlr(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                openlr_ = value;
                onChanged();
                return this;
            }
            /**
             * <pre>
             * The binary OpenLR location reference.
             * </pre>
             *
             * <code>optional bytes openlr = 2;</code>
             */
            public Builder clearOpenlr() {
                bitField0_ = (bitField0_ & ~0x00000002);
                openlr_ = getDefaultInstance().getOpenlr();
                onChanged();
                return this;
            }

            private int lengthInMeters_ ;
            /**
             * <pre>
             * Length of location in meters.
             * </pre>
             *
             * <code>optional uint32 lengthInMeters = 3;</code>
             */
            public boolean hasLengthInMeters() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <pre>
             * Length of location in meters.
             * </pre>
             *
             * <code>optional uint32 lengthInMeters = 3;</code>
             */
            public int getLengthInMeters() {
                return lengthInMeters_;
            }
            /**
             * <pre>
             * Length of location in meters.
             * </pre>
             *
             * <code>optional uint32 lengthInMeters = 3;</code>
             */
            public Builder setLengthInMeters(int value) {
                bitField0_ |= 0x00000004;
                lengthInMeters_ = value;
                onChanged();
                return this;
            }
            /**
             * <pre>
             * Length of location in meters.
             * </pre>
             *
             * <code>optional uint32 lengthInMeters = 3;</code>
             */
            public Builder clearLengthInMeters() {
                bitField0_ = (bitField0_ & ~0x00000004);
                lengthInMeters_ = 0;
                onChanged();
                return this;
            }
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:model.traffic.Location)
        }

        // @@protoc_insertion_point(class_scope:model.traffic.Location)
        private static final Location DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new Location();
        }

        public static Location getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @Deprecated public static final com.google.protobuf.Parser<Location>
                PARSER = new com.google.protobuf.AbstractParser<Location>() {
            public Location parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new Location(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<Location> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<Location> getParserForType() {
            return PARSER;
        }

        public Location getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface SpeedOrBuilder extends
            // @@protoc_insertion_point(interface_extends:model.traffic.Speed)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <pre>
         * The average speed along a location in kilometers per hour.
         * </pre>
         *
         * <code>optional int32 averageSpeedKmph = 1;</code>
         */
        boolean hasAverageSpeedKmph();
        /**
         * <pre>
         * The average speed along a location in kilometers per hour.
         * </pre>
         *
         * <code>optional int32 averageSpeedKmph = 1;</code>
         */
        int getAverageSpeedKmph();

        /**
         * <pre>
         * The time to pass a location in seconds.
         * </pre>
         *
         * <code>optional int32 travelTimeSeconds = 2;</code>
         */
        boolean hasTravelTimeSeconds();
        /**
         * <pre>
         * The time to pass a location in seconds.
         * </pre>
         *
         * <code>optional int32 travelTimeSeconds = 2;</code>
         */
        int getTravelTimeSeconds();

        /**
         * <pre>
         * An indication of the likeliness that the speed information is
         * realistic, on a scale from 0 (unlikely) to 100 (absolutely sure)
         * </pre>
         *
         * <code>optional int32 confidence = 3;</code>
         */
        boolean hasConfidence();
        /**
         * <pre>
         * An indication of the likeliness that the speed information is
         * realistic, on a scale from 0 (unlikely) to 100 (absolutely sure)
         * </pre>
         *
         * <code>optional int32 confidence = 3;</code>
         */
        int getConfidence();

        /**
         * <pre>
         * The ratio of current speed to the free flow speed on a scale from 0
         * (stationary traffic) to 1 (free flow traffic). The precision is three
         * decimal places.
         * </pre>
         *
         * <code>optional float relativeSpeed = 4;</code>
         */
        boolean hasRelativeSpeed();
        /**
         * <pre>
         * The ratio of current speed to the free flow speed on a scale from 0
         * (stationary traffic) to 1 (free flow traffic). The precision is three
         * decimal places.
         * </pre>
         *
         * <code>optional float relativeSpeed = 4;</code>
         */
        float getRelativeSpeed();

        /**
         * <pre>
         * Traffic condition on the affected location.
         * </pre>
         *
         * <code>optional .model.traffic.TrafficCondition trafficCondition = 5;</code>
         */
        boolean hasTrafficCondition();
        /**
         * <pre>
         * Traffic condition on the affected location.
         * </pre>
         *
         * <code>optional .model.traffic.TrafficCondition trafficCondition = 5;</code>
         */
        TrafficCondition getTrafficCondition();

        /**
         * <pre>
         * The average speed along a location in international miles per hour.
         * </pre>
         *
         * <code>optional int32 averageSpeedMph = 6;</code>
         */
        boolean hasAverageSpeedMph();
        /**
         * <pre>
         * The average speed along a location in international miles per hour.
         * </pre>
         *
         * <code>optional int32 averageSpeedMph = 6;</code>
         */
        int getAverageSpeedMph();
    }
    /**
     * <pre>
     * The speed message subsumes all speed and travel time related information.
     * </pre>
     *
     * Protobuf type {@code model.traffic.Speed}
     */
    public  static final class Speed extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:model.traffic.Speed)
            SpeedOrBuilder {
        // Use Speed.newBuilder() to construct.
        private Speed(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private Speed() {
            averageSpeedKmph_ = 0;
            travelTimeSeconds_ = 0;
            confidence_ = 0;
            relativeSpeed_ = 0F;
            trafficCondition_ = 1;
            averageSpeedMph_ = 0;
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private Speed(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {
                            bitField0_ |= 0x00000001;
                            averageSpeedKmph_ = input.readInt32();
                            break;
                        }
                        case 16: {
                            bitField0_ |= 0x00000002;
                            travelTimeSeconds_ = input.readInt32();
                            break;
                        }
                        case 24: {
                            bitField0_ |= 0x00000004;
                            confidence_ = input.readInt32();
                            break;
                        }
                        case 37: {
                            bitField0_ |= 0x00000008;
                            relativeSpeed_ = input.readFloat();
                            break;
                        }
                        case 40: {
                            int rawValue = input.readEnum();
                            TrafficCondition value = TrafficCondition.valueOf(rawValue);
                            if (value == null) {
                                unknownFields.mergeVarintField(5, rawValue);
                            } else {
                                bitField0_ |= 0x00000010;
                                trafficCondition_ = rawValue;
                            }
                            break;
                        }
                        case 48: {
                            bitField0_ |= 0x00000020;
                            averageSpeedMph_ = input.readInt32();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return ProtobufTrafficFlowV5.internal_static_model_traffic_Speed_descriptor;
        }

        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return ProtobufTrafficFlowV5.internal_static_model_traffic_Speed_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            Speed.class, Builder.class);
        }

        private int bitField0_;
        public static final int AVERAGESPEEDKMPH_FIELD_NUMBER = 1;
        private int averageSpeedKmph_;
        /**
         * <pre>
         * The average speed along a location in kilometers per hour.
         * </pre>
         *
         * <code>optional int32 averageSpeedKmph = 1;</code>
         */
        public boolean hasAverageSpeedKmph() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <pre>
         * The average speed along a location in kilometers per hour.
         * </pre>
         *
         * <code>optional int32 averageSpeedKmph = 1;</code>
         */
        public int getAverageSpeedKmph() {
            return averageSpeedKmph_;
        }

        public static final int TRAVELTIMESECONDS_FIELD_NUMBER = 2;
        private int travelTimeSeconds_;
        /**
         * <pre>
         * The time to pass a location in seconds.
         * </pre>
         *
         * <code>optional int32 travelTimeSeconds = 2;</code>
         */
        public boolean hasTravelTimeSeconds() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <pre>
         * The time to pass a location in seconds.
         * </pre>
         *
         * <code>optional int32 travelTimeSeconds = 2;</code>
         */
        public int getTravelTimeSeconds() {
            return travelTimeSeconds_;
        }

        public static final int CONFIDENCE_FIELD_NUMBER = 3;
        private int confidence_;
        /**
         * <pre>
         * An indication of the likeliness that the speed information is
         * realistic, on a scale from 0 (unlikely) to 100 (absolutely sure)
         * </pre>
         *
         * <code>optional int32 confidence = 3;</code>
         */
        public boolean hasConfidence() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <pre>
         * An indication of the likeliness that the speed information is
         * realistic, on a scale from 0 (unlikely) to 100 (absolutely sure)
         * </pre>
         *
         * <code>optional int32 confidence = 3;</code>
         */
        public int getConfidence() {
            return confidence_;
        }

        public static final int RELATIVESPEED_FIELD_NUMBER = 4;
        private float relativeSpeed_;
        /**
         * <pre>
         * The ratio of current speed to the free flow speed on a scale from 0
         * (stationary traffic) to 1 (free flow traffic). The precision is three
         * decimal places.
         * </pre>
         *
         * <code>optional float relativeSpeed = 4;</code>
         */
        public boolean hasRelativeSpeed() {
            return ((bitField0_ & 0x00000008) == 0x00000008);
        }
        /**
         * <pre>
         * The ratio of current speed to the free flow speed on a scale from 0
         * (stationary traffic) to 1 (free flow traffic). The precision is three
         * decimal places.
         * </pre>
         *
         * <code>optional float relativeSpeed = 4;</code>
         */
        public float getRelativeSpeed() {
            return relativeSpeed_;
        }

        public static final int TRAFFICCONDITION_FIELD_NUMBER = 5;
        private int trafficCondition_;
        /**
         * <pre>
         * Traffic condition on the affected location.
         * </pre>
         *
         * <code>optional .model.traffic.TrafficCondition trafficCondition = 5;</code>
         */
        public boolean hasTrafficCondition() {
            return ((bitField0_ & 0x00000010) == 0x00000010);
        }
        /**
         * <pre>
         * Traffic condition on the affected location.
         * </pre>
         *
         * <code>optional .model.traffic.TrafficCondition trafficCondition = 5;</code>
         */
        public TrafficCondition getTrafficCondition() {
            TrafficCondition result = TrafficCondition.valueOf(trafficCondition_);
            return result == null ? TrafficCondition.LONG_QUEUES_TRAFFIC : result;
        }

        public static final int AVERAGESPEEDMPH_FIELD_NUMBER = 6;
        private int averageSpeedMph_;
        /**
         * <pre>
         * The average speed along a location in international miles per hour.
         * </pre>
         *
         * <code>optional int32 averageSpeedMph = 6;</code>
         */
        public boolean hasAverageSpeedMph() {
            return ((bitField0_ & 0x00000020) == 0x00000020);
        }
        /**
         * <pre>
         * The average speed along a location in international miles per hour.
         * </pre>
         *
         * <code>optional int32 averageSpeedMph = 6;</code>
         */
        public int getAverageSpeedMph() {
            return averageSpeedMph_;
        }

        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeInt32(1, averageSpeedKmph_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeInt32(2, travelTimeSeconds_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeInt32(3, confidence_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                output.writeFloat(4, relativeSpeed_);
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                output.writeEnum(5, trafficCondition_);
            }
            if (((bitField0_ & 0x00000020) == 0x00000020)) {
                output.writeInt32(6, averageSpeedMph_);
            }
            unknownFields.writeTo(output);
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(1, averageSpeedKmph_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(2, travelTimeSeconds_);
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(3, confidence_);
            }
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeFloatSize(4, relativeSpeed_);
            }
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeEnumSize(5, trafficCondition_);
            }
            if (((bitField0_ & 0x00000020) == 0x00000020)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(6, averageSpeedMph_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Speed)) {
                return super.equals(obj);
            }
            Speed other = (Speed) obj;

            boolean result = true;
            result = result && (hasAverageSpeedKmph() == other.hasAverageSpeedKmph());
            if (hasAverageSpeedKmph()) {
                result = result && (getAverageSpeedKmph()
                        == other.getAverageSpeedKmph());
            }
            result = result && (hasTravelTimeSeconds() == other.hasTravelTimeSeconds());
            if (hasTravelTimeSeconds()) {
                result = result && (getTravelTimeSeconds()
                        == other.getTravelTimeSeconds());
            }
            result = result && (hasConfidence() == other.hasConfidence());
            if (hasConfidence()) {
                result = result && (getConfidence()
                        == other.getConfidence());
            }
            result = result && (hasRelativeSpeed() == other.hasRelativeSpeed());
            if (hasRelativeSpeed()) {
                result = result && (
                        Float.floatToIntBits(getRelativeSpeed())
                                == Float.floatToIntBits(
                                other.getRelativeSpeed()));
            }
            result = result && (hasTrafficCondition() == other.hasTrafficCondition());
            if (hasTrafficCondition()) {
                result = result && trafficCondition_ == other.trafficCondition_;
            }
            result = result && (hasAverageSpeedMph() == other.hasAverageSpeedMph());
            if (hasAverageSpeedMph()) {
                result = result && (getAverageSpeedMph()
                        == other.getAverageSpeedMph());
            }
            result = result && unknownFields.equals(other.unknownFields);
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (hasAverageSpeedKmph()) {
                hash = (37 * hash) + AVERAGESPEEDKMPH_FIELD_NUMBER;
                hash = (53 * hash) + getAverageSpeedKmph();
            }
            if (hasTravelTimeSeconds()) {
                hash = (37 * hash) + TRAVELTIMESECONDS_FIELD_NUMBER;
                hash = (53 * hash) + getTravelTimeSeconds();
            }
            if (hasConfidence()) {
                hash = (37 * hash) + CONFIDENCE_FIELD_NUMBER;
                hash = (53 * hash) + getConfidence();
            }
            if (hasRelativeSpeed()) {
                hash = (37 * hash) + RELATIVESPEED_FIELD_NUMBER;
                hash = (53 * hash) + Float.floatToIntBits(
                        getRelativeSpeed());
            }
            if (hasTrafficCondition()) {
                hash = (37 * hash) + TRAFFICCONDITION_FIELD_NUMBER;
                hash = (53 * hash) + trafficCondition_;
            }
            if (hasAverageSpeedMph()) {
                hash = (37 * hash) + AVERAGESPEEDMPH_FIELD_NUMBER;
                hash = (53 * hash) + getAverageSpeedMph();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static Speed parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static Speed parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Speed parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static Speed parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Speed parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static Speed parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Speed parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static Speed parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static Speed parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static Speed parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static Speed parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static Speed parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(Speed prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(
                BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * <pre>
         * The speed message subsumes all speed and travel time related information.
         * </pre>
         *
         * Protobuf type {@code model.traffic.Speed}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:model.traffic.Speed)
                SpeedOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ProtobufTrafficFlowV5.internal_static_model_traffic_Speed_descriptor;
            }

            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ProtobufTrafficFlowV5.internal_static_model_traffic_Speed_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                Speed.class, Builder.class);
            }

            // Construct using model.traffic.ProtobufTrafficFlowV5.Speed.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }
            public Builder clear() {
                super.clear();
                averageSpeedKmph_ = 0;
                bitField0_ = (bitField0_ & ~0x00000001);
                travelTimeSeconds_ = 0;
                bitField0_ = (bitField0_ & ~0x00000002);
                confidence_ = 0;
                bitField0_ = (bitField0_ & ~0x00000004);
                relativeSpeed_ = 0F;
                bitField0_ = (bitField0_ & ~0x00000008);
                trafficCondition_ = 1;
                bitField0_ = (bitField0_ & ~0x00000010);
                averageSpeedMph_ = 0;
                bitField0_ = (bitField0_ & ~0x00000020);
                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return ProtobufTrafficFlowV5.internal_static_model_traffic_Speed_descriptor;
            }

            public Speed getDefaultInstanceForType() {
                return Speed.getDefaultInstance();
            }

            public Speed build() {
                Speed result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public Speed buildPartial() {
                Speed result = new Speed(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.averageSpeedKmph_ = averageSpeedKmph_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.travelTimeSeconds_ = travelTimeSeconds_;
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.confidence_ = confidence_;
                if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
                    to_bitField0_ |= 0x00000008;
                }
                result.relativeSpeed_ = relativeSpeed_;
                if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
                    to_bitField0_ |= 0x00000010;
                }
                result.trafficCondition_ = trafficCondition_;
                if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
                    to_bitField0_ |= 0x00000020;
                }
                result.averageSpeedMph_ = averageSpeedMph_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof Speed) {
                    return mergeFrom((Speed)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(Speed other) {
                if (other == Speed.getDefaultInstance()) return this;
                if (other.hasAverageSpeedKmph()) {
                    setAverageSpeedKmph(other.getAverageSpeedKmph());
                }
                if (other.hasTravelTimeSeconds()) {
                    setTravelTimeSeconds(other.getTravelTimeSeconds());
                }
                if (other.hasConfidence()) {
                    setConfidence(other.getConfidence());
                }
                if (other.hasRelativeSpeed()) {
                    setRelativeSpeed(other.getRelativeSpeed());
                }
                if (other.hasTrafficCondition()) {
                    setTrafficCondition(other.getTrafficCondition());
                }
                if (other.hasAverageSpeedMph()) {
                    setAverageSpeedMph(other.getAverageSpeedMph());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                Speed parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (Speed) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            private int averageSpeedKmph_ ;
            /**
             * <pre>
             * The average speed along a location in kilometers per hour.
             * </pre>
             *
             * <code>optional int32 averageSpeedKmph = 1;</code>
             */
            public boolean hasAverageSpeedKmph() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <pre>
             * The average speed along a location in kilometers per hour.
             * </pre>
             *
             * <code>optional int32 averageSpeedKmph = 1;</code>
             */
            public int getAverageSpeedKmph() {
                return averageSpeedKmph_;
            }
            /**
             * <pre>
             * The average speed along a location in kilometers per hour.
             * </pre>
             *
             * <code>optional int32 averageSpeedKmph = 1;</code>
             */
            public Builder setAverageSpeedKmph(int value) {
                bitField0_ |= 0x00000001;
                averageSpeedKmph_ = value;
                onChanged();
                return this;
            }
            /**
             * <pre>
             * The average speed along a location in kilometers per hour.
             * </pre>
             *
             * <code>optional int32 averageSpeedKmph = 1;</code>
             */
            public Builder clearAverageSpeedKmph() {
                bitField0_ = (bitField0_ & ~0x00000001);
                averageSpeedKmph_ = 0;
                onChanged();
                return this;
            }

            private int travelTimeSeconds_ ;
            /**
             * <pre>
             * The time to pass a location in seconds.
             * </pre>
             *
             * <code>optional int32 travelTimeSeconds = 2;</code>
             */
            public boolean hasTravelTimeSeconds() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <pre>
             * The time to pass a location in seconds.
             * </pre>
             *
             * <code>optional int32 travelTimeSeconds = 2;</code>
             */
            public int getTravelTimeSeconds() {
                return travelTimeSeconds_;
            }
            /**
             * <pre>
             * The time to pass a location in seconds.
             * </pre>
             *
             * <code>optional int32 travelTimeSeconds = 2;</code>
             */
            public Builder setTravelTimeSeconds(int value) {
                bitField0_ |= 0x00000002;
                travelTimeSeconds_ = value;
                onChanged();
                return this;
            }
            /**
             * <pre>
             * The time to pass a location in seconds.
             * </pre>
             *
             * <code>optional int32 travelTimeSeconds = 2;</code>
             */
            public Builder clearTravelTimeSeconds() {
                bitField0_ = (bitField0_ & ~0x00000002);
                travelTimeSeconds_ = 0;
                onChanged();
                return this;
            }

            private int confidence_ ;
            /**
             * <pre>
             * An indication of the likeliness that the speed information is
             * realistic, on a scale from 0 (unlikely) to 100 (absolutely sure)
             * </pre>
             *
             * <code>optional int32 confidence = 3;</code>
             */
            public boolean hasConfidence() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <pre>
             * An indication of the likeliness that the speed information is
             * realistic, on a scale from 0 (unlikely) to 100 (absolutely sure)
             * </pre>
             *
             * <code>optional int32 confidence = 3;</code>
             */
            public int getConfidence() {
                return confidence_;
            }
            /**
             * <pre>
             * An indication of the likeliness that the speed information is
             * realistic, on a scale from 0 (unlikely) to 100 (absolutely sure)
             * </pre>
             *
             * <code>optional int32 confidence = 3;</code>
             */
            public Builder setConfidence(int value) {
                bitField0_ |= 0x00000004;
                confidence_ = value;
                onChanged();
                return this;
            }
            /**
             * <pre>
             * An indication of the likeliness that the speed information is
             * realistic, on a scale from 0 (unlikely) to 100 (absolutely sure)
             * </pre>
             *
             * <code>optional int32 confidence = 3;</code>
             */
            public Builder clearConfidence() {
                bitField0_ = (bitField0_ & ~0x00000004);
                confidence_ = 0;
                onChanged();
                return this;
            }

            private float relativeSpeed_ ;
            /**
             * <pre>
             * The ratio of current speed to the free flow speed on a scale from 0
             * (stationary traffic) to 1 (free flow traffic). The precision is three
             * decimal places.
             * </pre>
             *
             * <code>optional float relativeSpeed = 4;</code>
             */
            public boolean hasRelativeSpeed() {
                return ((bitField0_ & 0x00000008) == 0x00000008);
            }
            /**
             * <pre>
             * The ratio of current speed to the free flow speed on a scale from 0
             * (stationary traffic) to 1 (free flow traffic). The precision is three
             * decimal places.
             * </pre>
             *
             * <code>optional float relativeSpeed = 4;</code>
             */
            public float getRelativeSpeed() {
                return relativeSpeed_;
            }
            /**
             * <pre>
             * The ratio of current speed to the free flow speed on a scale from 0
             * (stationary traffic) to 1 (free flow traffic). The precision is three
             * decimal places.
             * </pre>
             *
             * <code>optional float relativeSpeed = 4;</code>
             */
            public Builder setRelativeSpeed(float value) {
                bitField0_ |= 0x00000008;
                relativeSpeed_ = value;
                onChanged();
                return this;
            }
            /**
             * <pre>
             * The ratio of current speed to the free flow speed on a scale from 0
             * (stationary traffic) to 1 (free flow traffic). The precision is three
             * decimal places.
             * </pre>
             *
             * <code>optional float relativeSpeed = 4;</code>
             */
            public Builder clearRelativeSpeed() {
                bitField0_ = (bitField0_ & ~0x00000008);
                relativeSpeed_ = 0F;
                onChanged();
                return this;
            }

            private int trafficCondition_ = 1;
            /**
             * <pre>
             * Traffic condition on the affected location.
             * </pre>
             *
             * <code>optional .model.traffic.TrafficCondition trafficCondition = 5;</code>
             */
            public boolean hasTrafficCondition() {
                return ((bitField0_ & 0x00000010) == 0x00000010);
            }
            /**
             * <pre>
             * Traffic condition on the affected location.
             * </pre>
             *
             * <code>optional .model.traffic.TrafficCondition trafficCondition = 5;</code>
             */
            public TrafficCondition getTrafficCondition() {
                TrafficCondition result = TrafficCondition.valueOf(trafficCondition_);
                return result == null ? TrafficCondition.LONG_QUEUES_TRAFFIC : result;
            }
            /**
             * <pre>
             * Traffic condition on the affected location.
             * </pre>
             *
             * <code>optional .model.traffic.TrafficCondition trafficCondition = 5;</code>
             */
            public Builder setTrafficCondition(TrafficCondition value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000010;
                trafficCondition_ = value.getNumber();
                onChanged();
                return this;
            }
            /**
             * <pre>
             * Traffic condition on the affected location.
             * </pre>
             *
             * <code>optional .model.traffic.TrafficCondition trafficCondition = 5;</code>
             */
            public Builder clearTrafficCondition() {
                bitField0_ = (bitField0_ & ~0x00000010);
                trafficCondition_ = 1;
                onChanged();
                return this;
            }

            private int averageSpeedMph_ ;
            /**
             * <pre>
             * The average speed along a location in international miles per hour.
             * </pre>
             *
             * <code>optional int32 averageSpeedMph = 6;</code>
             */
            public boolean hasAverageSpeedMph() {
                return ((bitField0_ & 0x00000020) == 0x00000020);
            }
            /**
             * <pre>
             * The average speed along a location in international miles per hour.
             * </pre>
             *
             * <code>optional int32 averageSpeedMph = 6;</code>
             */
            public int getAverageSpeedMph() {
                return averageSpeedMph_;
            }
            /**
             * <pre>
             * The average speed along a location in international miles per hour.
             * </pre>
             *
             * <code>optional int32 averageSpeedMph = 6;</code>
             */
            public Builder setAverageSpeedMph(int value) {
                bitField0_ |= 0x00000020;
                averageSpeedMph_ = value;
                onChanged();
                return this;
            }
            /**
             * <pre>
             * The average speed along a location in international miles per hour.
             * </pre>
             *
             * <code>optional int32 averageSpeedMph = 6;</code>
             */
            public Builder clearAverageSpeedMph() {
                bitField0_ = (bitField0_ & ~0x00000020);
                averageSpeedMph_ = 0;
                onChanged();
                return this;
            }
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:model.traffic.Speed)
        }

        // @@protoc_insertion_point(class_scope:model.traffic.Speed)
        private static final Speed DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new Speed();
        }

        public static Speed getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @Deprecated public static final com.google.protobuf.Parser<Speed>
                PARSER = new com.google.protobuf.AbstractParser<Speed>() {
            public Speed parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new Speed(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<Speed> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<Speed> getParserForType() {
            return PARSER;
        }

        public Speed getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface SpeedWithTimeStampOrBuilder extends
            // @@protoc_insertion_point(interface_extends:model.traffic.SpeedWithTimeStamp)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <pre>
         * The minutes in future relative to the creation time of the complete flow data
         * the specified speed information is relevant. A value of 0 shall indicate the current
         * speed data.
         * </pre>
         *
         * <code>optional uint32 minutesInFuture = 1;</code>
         */
        boolean hasMinutesInFuture();
        /**
         * <pre>
         * The minutes in future relative to the creation time of the complete flow data
         * the specified speed information is relevant. A value of 0 shall indicate the current
         * speed data.
         * </pre>
         *
         * <code>optional uint32 minutesInFuture = 1;</code>
         */
        int getMinutesInFuture();

        /**
         * <pre>
         * The speed information at the specified time.
         * </pre>
         *
         * <code>optional .model.traffic.Speed speed = 2;</code>
         */
        boolean hasSpeed();
        /**
         * <pre>
         * The speed information at the specified time.
         * </pre>
         *
         * <code>optional .model.traffic.Speed speed = 2;</code>
         */
        Speed getSpeed();
        /**
         * <pre>
         * The speed information at the specified time.
         * </pre>
         *
         * <code>optional .model.traffic.Speed speed = 2;</code>
         */
        SpeedOrBuilder getSpeedOrBuilder();
    }
    /**
     * <pre>
     * Combines a Speed message with a time stamp in the future this speed is relevant for.
     * </pre>
     *
     * Protobuf type {@code model.traffic.SpeedWithTimeStamp}
     */
    public  static final class SpeedWithTimeStamp extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:model.traffic.SpeedWithTimeStamp)
            SpeedWithTimeStampOrBuilder {
        // Use SpeedWithTimeStamp.newBuilder() to construct.
        private SpeedWithTimeStamp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private SpeedWithTimeStamp() {
            minutesInFuture_ = 0;
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private SpeedWithTimeStamp(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {
                            bitField0_ |= 0x00000001;
                            minutesInFuture_ = input.readUInt32();
                            break;
                        }
                        case 18: {
                            Speed.Builder subBuilder = null;
                            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                                subBuilder = speed_.toBuilder();
                            }
                            speed_ = input.readMessage(Speed.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(speed_);
                                speed_ = subBuilder.buildPartial();
                            }
                            bitField0_ |= 0x00000002;
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return ProtobufTrafficFlowV5.internal_static_model_traffic_SpeedWithTimeStamp_descriptor;
        }

        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return ProtobufTrafficFlowV5.internal_static_model_traffic_SpeedWithTimeStamp_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            SpeedWithTimeStamp.class, Builder.class);
        }

        private int bitField0_;
        public static final int MINUTESINFUTURE_FIELD_NUMBER = 1;
        private int minutesInFuture_;
        /**
         * <pre>
         * The minutes in future relative to the creation time of the complete flow data
         * the specified speed information is relevant. A value of 0 shall indicate the current
         * speed data.
         * </pre>
         *
         * <code>optional uint32 minutesInFuture = 1;</code>
         */
        public boolean hasMinutesInFuture() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <pre>
         * The minutes in future relative to the creation time of the complete flow data
         * the specified speed information is relevant. A value of 0 shall indicate the current
         * speed data.
         * </pre>
         *
         * <code>optional uint32 minutesInFuture = 1;</code>
         */
        public int getMinutesInFuture() {
            return minutesInFuture_;
        }

        public static final int SPEED_FIELD_NUMBER = 2;
        private Speed speed_;
        /**
         * <pre>
         * The speed information at the specified time.
         * </pre>
         *
         * <code>optional .model.traffic.Speed speed = 2;</code>
         */
        public boolean hasSpeed() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <pre>
         * The speed information at the specified time.
         * </pre>
         *
         * <code>optional .model.traffic.Speed speed = 2;</code>
         */
        public Speed getSpeed() {
            return speed_ == null ? Speed.getDefaultInstance() : speed_;
        }
        /**
         * <pre>
         * The speed information at the specified time.
         * </pre>
         *
         * <code>optional .model.traffic.Speed speed = 2;</code>
         */
        public SpeedOrBuilder getSpeedOrBuilder() {
            return speed_ == null ? Speed.getDefaultInstance() : speed_;
        }

        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeUInt32(1, minutesInFuture_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeMessage(2, getSpeed());
            }
            unknownFields.writeTo(output);
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(1, minutesInFuture_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(2, getSpeed());
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SpeedWithTimeStamp)) {
                return super.equals(obj);
            }
            SpeedWithTimeStamp other = (SpeedWithTimeStamp) obj;

            boolean result = true;
            result = result && (hasMinutesInFuture() == other.hasMinutesInFuture());
            if (hasMinutesInFuture()) {
                result = result && (getMinutesInFuture()
                        == other.getMinutesInFuture());
            }
            result = result && (hasSpeed() == other.hasSpeed());
            if (hasSpeed()) {
                result = result && getSpeed()
                        .equals(other.getSpeed());
            }
            result = result && unknownFields.equals(other.unknownFields);
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (hasMinutesInFuture()) {
                hash = (37 * hash) + MINUTESINFUTURE_FIELD_NUMBER;
                hash = (53 * hash) + getMinutesInFuture();
            }
            if (hasSpeed()) {
                hash = (37 * hash) + SPEED_FIELD_NUMBER;
                hash = (53 * hash) + getSpeed().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static SpeedWithTimeStamp parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SpeedWithTimeStamp parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SpeedWithTimeStamp parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SpeedWithTimeStamp parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SpeedWithTimeStamp parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SpeedWithTimeStamp parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SpeedWithTimeStamp parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static SpeedWithTimeStamp parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static SpeedWithTimeStamp parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static SpeedWithTimeStamp parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static SpeedWithTimeStamp parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static SpeedWithTimeStamp parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(SpeedWithTimeStamp prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(
                BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * <pre>
         * Combines a Speed message with a time stamp in the future this speed is relevant for.
         * </pre>
         *
         * Protobuf type {@code model.traffic.SpeedWithTimeStamp}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:model.traffic.SpeedWithTimeStamp)
                SpeedWithTimeStampOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ProtobufTrafficFlowV5.internal_static_model_traffic_SpeedWithTimeStamp_descriptor;
            }

            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ProtobufTrafficFlowV5.internal_static_model_traffic_SpeedWithTimeStamp_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                SpeedWithTimeStamp.class, Builder.class);
            }

            // Construct using model.traffic.ProtobufTrafficFlowV5.SpeedWithTimeStamp.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                    getSpeedFieldBuilder();
                }
            }
            public Builder clear() {
                super.clear();
                minutesInFuture_ = 0;
                bitField0_ = (bitField0_ & ~0x00000001);
                if (speedBuilder_ == null) {
                    speed_ = null;
                } else {
                    speedBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000002);
                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return ProtobufTrafficFlowV5.internal_static_model_traffic_SpeedWithTimeStamp_descriptor;
            }

            public SpeedWithTimeStamp getDefaultInstanceForType() {
                return SpeedWithTimeStamp.getDefaultInstance();
            }

            public SpeedWithTimeStamp build() {
                SpeedWithTimeStamp result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public SpeedWithTimeStamp buildPartial() {
                SpeedWithTimeStamp result = new SpeedWithTimeStamp(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.minutesInFuture_ = minutesInFuture_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                if (speedBuilder_ == null) {
                    result.speed_ = speed_;
                } else {
                    result.speed_ = speedBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof SpeedWithTimeStamp) {
                    return mergeFrom((SpeedWithTimeStamp)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(SpeedWithTimeStamp other) {
                if (other == SpeedWithTimeStamp.getDefaultInstance()) return this;
                if (other.hasMinutesInFuture()) {
                    setMinutesInFuture(other.getMinutesInFuture());
                }
                if (other.hasSpeed()) {
                    mergeSpeed(other.getSpeed());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                SpeedWithTimeStamp parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (SpeedWithTimeStamp) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            private int minutesInFuture_ ;
            /**
             * <pre>
             * The minutes in future relative to the creation time of the complete flow data
             * the specified speed information is relevant. A value of 0 shall indicate the current
             * speed data.
             * </pre>
             *
             * <code>optional uint32 minutesInFuture = 1;</code>
             */
            public boolean hasMinutesInFuture() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <pre>
             * The minutes in future relative to the creation time of the complete flow data
             * the specified speed information is relevant. A value of 0 shall indicate the current
             * speed data.
             * </pre>
             *
             * <code>optional uint32 minutesInFuture = 1;</code>
             */
            public int getMinutesInFuture() {
                return minutesInFuture_;
            }
            /**
             * <pre>
             * The minutes in future relative to the creation time of the complete flow data
             * the specified speed information is relevant. A value of 0 shall indicate the current
             * speed data.
             * </pre>
             *
             * <code>optional uint32 minutesInFuture = 1;</code>
             */
            public Builder setMinutesInFuture(int value) {
                bitField0_ |= 0x00000001;
                minutesInFuture_ = value;
                onChanged();
                return this;
            }
            /**
             * <pre>
             * The minutes in future relative to the creation time of the complete flow data
             * the specified speed information is relevant. A value of 0 shall indicate the current
             * speed data.
             * </pre>
             *
             * <code>optional uint32 minutesInFuture = 1;</code>
             */
            public Builder clearMinutesInFuture() {
                bitField0_ = (bitField0_ & ~0x00000001);
                minutesInFuture_ = 0;
                onChanged();
                return this;
            }

            private Speed speed_ = null;
            private com.google.protobuf.SingleFieldBuilderV3<
                    Speed, Speed.Builder, SpeedOrBuilder> speedBuilder_;
            /**
             * <pre>
             * The speed information at the specified time.
             * </pre>
             *
             * <code>optional .model.traffic.Speed speed = 2;</code>
             */
            public boolean hasSpeed() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <pre>
             * The speed information at the specified time.
             * </pre>
             *
             * <code>optional .model.traffic.Speed speed = 2;</code>
             */
            public Speed getSpeed() {
                if (speedBuilder_ == null) {
                    return speed_ == null ? Speed.getDefaultInstance() : speed_;
                } else {
                    return speedBuilder_.getMessage();
                }
            }
            /**
             * <pre>
             * The speed information at the specified time.
             * </pre>
             *
             * <code>optional .model.traffic.Speed speed = 2;</code>
             */
            public Builder setSpeed(Speed value) {
                if (speedBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    speed_ = value;
                    onChanged();
                } else {
                    speedBuilder_.setMessage(value);
                }
                bitField0_ |= 0x00000002;
                return this;
            }
            /**
             * <pre>
             * The speed information at the specified time.
             * </pre>
             *
             * <code>optional .model.traffic.Speed speed = 2;</code>
             */
            public Builder setSpeed(
                    Speed.Builder builderForValue) {
                if (speedBuilder_ == null) {
                    speed_ = builderForValue.build();
                    onChanged();
                } else {
                    speedBuilder_.setMessage(builderForValue.build());
                }
                bitField0_ |= 0x00000002;
                return this;
            }
            /**
             * <pre>
             * The speed information at the specified time.
             * </pre>
             *
             * <code>optional .model.traffic.Speed speed = 2;</code>
             */
            public Builder mergeSpeed(Speed value) {
                if (speedBuilder_ == null) {
                    if (((bitField0_ & 0x00000002) == 0x00000002) &&
                            speed_ != null &&
                            speed_ != Speed.getDefaultInstance()) {
                        speed_ =
                                Speed.newBuilder(speed_).mergeFrom(value).buildPartial();
                    } else {
                        speed_ = value;
                    }
                    onChanged();
                } else {
                    speedBuilder_.mergeFrom(value);
                }
                bitField0_ |= 0x00000002;
                return this;
            }
            /**
             * <pre>
             * The speed information at the specified time.
             * </pre>
             *
             * <code>optional .model.traffic.Speed speed = 2;</code>
             */
            public Builder clearSpeed() {
                if (speedBuilder_ == null) {
                    speed_ = null;
                    onChanged();
                } else {
                    speedBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000002);
                return this;
            }
            /**
             * <pre>
             * The speed information at the specified time.
             * </pre>
             *
             * <code>optional .model.traffic.Speed speed = 2;</code>
             */
            public Speed.Builder getSpeedBuilder() {
                bitField0_ |= 0x00000002;
                onChanged();
                return getSpeedFieldBuilder().getBuilder();
            }
            /**
             * <pre>
             * The speed information at the specified time.
             * </pre>
             *
             * <code>optional .model.traffic.Speed speed = 2;</code>
             */
            public SpeedOrBuilder getSpeedOrBuilder() {
                if (speedBuilder_ != null) {
                    return speedBuilder_.getMessageOrBuilder();
                } else {
                    return speed_ == null ?
                            Speed.getDefaultInstance() : speed_;
                }
            }
            /**
             * <pre>
             * The speed information at the specified time.
             * </pre>
             *
             * <code>optional .model.traffic.Speed speed = 2;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    Speed, Speed.Builder, SpeedOrBuilder>
            getSpeedFieldBuilder() {
                if (speedBuilder_ == null) {
                    speedBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            Speed, Speed.Builder, SpeedOrBuilder>(
                            getSpeed(),
                            getParentForChildren(),
                            isClean());
                    speed_ = null;
                }
                return speedBuilder_;
            }
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:model.traffic.SpeedWithTimeStamp)
        }

        // @@protoc_insertion_point(class_scope:model.traffic.SpeedWithTimeStamp)
        private static final SpeedWithTimeStamp DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new SpeedWithTimeStamp();
        }

        public static SpeedWithTimeStamp getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @Deprecated public static final com.google.protobuf.Parser<SpeedWithTimeStamp>
                PARSER = new com.google.protobuf.AbstractParser<SpeedWithTimeStamp>() {
            public SpeedWithTimeStamp parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new SpeedWithTimeStamp(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<SpeedWithTimeStamp> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<SpeedWithTimeStamp> getParserForType() {
            return PARSER;
        }

        public SpeedWithTimeStamp getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface SpeedVectorOrBuilder extends
            // @@protoc_insertion_point(interface_extends:model.traffic.SpeedVector)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <pre>
         * The minutes in future relative to the creation time of the complete flow data
         * the specified speed information is relevant. A value of 0 shall indicate the current
         * speed data.
         * </pre>
         *
         * <code>optional uint32 minutesInFuture = 1;</code>
         */
        boolean hasMinutesInFuture();
        /**
         * <pre>
         * The minutes in future relative to the creation time of the complete flow data
         * the specified speed information is relevant. A value of 0 shall indicate the current
         * speed data.
         * </pre>
         *
         * <code>optional uint32 minutesInFuture = 1;</code>
         */
        int getMinutesInFuture();

        /**
         * <pre>
         * List of speed parameters per section. The sections are ordered by start offset.
         * </pre>
         *
         * <code>repeated .model.traffic.SectionSpeed sectionSpeed = 2;</code>
         */
        java.util.List<SectionSpeed>
        getSectionSpeedList();
        /**
         * <pre>
         * List of speed parameters per section. The sections are ordered by start offset.
         * </pre>
         *
         * <code>repeated .model.traffic.SectionSpeed sectionSpeed = 2;</code>
         */
        SectionSpeed getSectionSpeed(int index);
        /**
         * <pre>
         * List of speed parameters per section. The sections are ordered by start offset.
         * </pre>
         *
         * <code>repeated .model.traffic.SectionSpeed sectionSpeed = 2;</code>
         */
        int getSectionSpeedCount();
        /**
         * <pre>
         * List of speed parameters per section. The sections are ordered by start offset.
         * </pre>
         *
         * <code>repeated .model.traffic.SectionSpeed sectionSpeed = 2;</code>
         */
        java.util.List<? extends SectionSpeedOrBuilder>
        getSectionSpeedOrBuilderList();
        /**
         * <pre>
         * List of speed parameters per section. The sections are ordered by start offset.
         * </pre>
         *
         * <code>repeated .model.traffic.SectionSpeed sectionSpeed = 2;</code>
         */
        SectionSpeedOrBuilder getSectionSpeedOrBuilder(
                int index);
    }
    /**
     * <pre>
     * Combines a SectionSpeeds message with a time stamp in the future these speeds are relevant for.
     * </pre>
     *
     * Protobuf type {@code model.traffic.SpeedVector}
     */
    public  static final class SpeedVector extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:model.traffic.SpeedVector)
            SpeedVectorOrBuilder {
        // Use SpeedVector.newBuilder() to construct.
        private SpeedVector(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private SpeedVector() {
            minutesInFuture_ = 0;
            sectionSpeed_ = java.util.Collections.emptyList();
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private SpeedVector(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {
                            bitField0_ |= 0x00000001;
                            minutesInFuture_ = input.readUInt32();
                            break;
                        }
                        case 18: {
                            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                                sectionSpeed_ = new java.util.ArrayList<SectionSpeed>();
                                mutable_bitField0_ |= 0x00000002;
                            }
                            sectionSpeed_.add(
                                    input.readMessage(SectionSpeed.PARSER, extensionRegistry));
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                    sectionSpeed_ = java.util.Collections.unmodifiableList(sectionSpeed_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return ProtobufTrafficFlowV5.internal_static_model_traffic_SpeedVector_descriptor;
        }

        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return ProtobufTrafficFlowV5.internal_static_model_traffic_SpeedVector_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            SpeedVector.class, Builder.class);
        }

        private int bitField0_;
        public static final int MINUTESINFUTURE_FIELD_NUMBER = 1;
        private int minutesInFuture_;
        /**
         * <pre>
         * The minutes in future relative to the creation time of the complete flow data
         * the specified speed information is relevant. A value of 0 shall indicate the current
         * speed data.
         * </pre>
         *
         * <code>optional uint32 minutesInFuture = 1;</code>
         */
        public boolean hasMinutesInFuture() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <pre>
         * The minutes in future relative to the creation time of the complete flow data
         * the specified speed information is relevant. A value of 0 shall indicate the current
         * speed data.
         * </pre>
         *
         * <code>optional uint32 minutesInFuture = 1;</code>
         */
        public int getMinutesInFuture() {
            return minutesInFuture_;
        }

        public static final int SECTIONSPEED_FIELD_NUMBER = 2;
        private java.util.List<SectionSpeed> sectionSpeed_;
        /**
         * <pre>
         * List of speed parameters per section. The sections are ordered by start offset.
         * </pre>
         *
         * <code>repeated .model.traffic.SectionSpeed sectionSpeed = 2;</code>
         */
        public java.util.List<SectionSpeed> getSectionSpeedList() {
            return sectionSpeed_;
        }
        /**
         * <pre>
         * List of speed parameters per section. The sections are ordered by start offset.
         * </pre>
         *
         * <code>repeated .model.traffic.SectionSpeed sectionSpeed = 2;</code>
         */
        public java.util.List<? extends SectionSpeedOrBuilder>
        getSectionSpeedOrBuilderList() {
            return sectionSpeed_;
        }
        /**
         * <pre>
         * List of speed parameters per section. The sections are ordered by start offset.
         * </pre>
         *
         * <code>repeated .model.traffic.SectionSpeed sectionSpeed = 2;</code>
         */
        public int getSectionSpeedCount() {
            return sectionSpeed_.size();
        }
        /**
         * <pre>
         * List of speed parameters per section. The sections are ordered by start offset.
         * </pre>
         *
         * <code>repeated .model.traffic.SectionSpeed sectionSpeed = 2;</code>
         */
        public SectionSpeed getSectionSpeed(int index) {
            return sectionSpeed_.get(index);
        }
        /**
         * <pre>
         * List of speed parameters per section. The sections are ordered by start offset.
         * </pre>
         *
         * <code>repeated .model.traffic.SectionSpeed sectionSpeed = 2;</code>
         */
        public SectionSpeedOrBuilder getSectionSpeedOrBuilder(
                int index) {
            return sectionSpeed_.get(index);
        }

        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeUInt32(1, minutesInFuture_);
            }
            for (int i = 0; i < sectionSpeed_.size(); i++) {
                output.writeMessage(2, sectionSpeed_.get(i));
            }
            unknownFields.writeTo(output);
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(1, minutesInFuture_);
            }
            for (int i = 0; i < sectionSpeed_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(2, sectionSpeed_.get(i));
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SpeedVector)) {
                return super.equals(obj);
            }
            SpeedVector other = (SpeedVector) obj;

            boolean result = true;
            result = result && (hasMinutesInFuture() == other.hasMinutesInFuture());
            if (hasMinutesInFuture()) {
                result = result && (getMinutesInFuture()
                        == other.getMinutesInFuture());
            }
            result = result && getSectionSpeedList()
                    .equals(other.getSectionSpeedList());
            result = result && unknownFields.equals(other.unknownFields);
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (hasMinutesInFuture()) {
                hash = (37 * hash) + MINUTESINFUTURE_FIELD_NUMBER;
                hash = (53 * hash) + getMinutesInFuture();
            }
            if (getSectionSpeedCount() > 0) {
                hash = (37 * hash) + SECTIONSPEED_FIELD_NUMBER;
                hash = (53 * hash) + getSectionSpeedList().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static SpeedVector parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SpeedVector parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SpeedVector parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SpeedVector parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SpeedVector parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SpeedVector parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SpeedVector parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static SpeedVector parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static SpeedVector parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static SpeedVector parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static SpeedVector parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static SpeedVector parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(SpeedVector prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(
                BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * <pre>
         * Combines a SectionSpeeds message with a time stamp in the future these speeds are relevant for.
         * </pre>
         *
         * Protobuf type {@code model.traffic.SpeedVector}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:model.traffic.SpeedVector)
                SpeedVectorOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ProtobufTrafficFlowV5.internal_static_model_traffic_SpeedVector_descriptor;
            }

            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ProtobufTrafficFlowV5.internal_static_model_traffic_SpeedVector_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                SpeedVector.class, Builder.class);
            }

            // Construct using model.traffic.ProtobufTrafficFlowV5.SpeedVector.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                    getSectionSpeedFieldBuilder();
                }
            }
            public Builder clear() {
                super.clear();
                minutesInFuture_ = 0;
                bitField0_ = (bitField0_ & ~0x00000001);
                if (sectionSpeedBuilder_ == null) {
                    sectionSpeed_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000002);
                } else {
                    sectionSpeedBuilder_.clear();
                }
                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return ProtobufTrafficFlowV5.internal_static_model_traffic_SpeedVector_descriptor;
            }

            public SpeedVector getDefaultInstanceForType() {
                return SpeedVector.getDefaultInstance();
            }

            public SpeedVector build() {
                SpeedVector result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public SpeedVector buildPartial() {
                SpeedVector result = new SpeedVector(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.minutesInFuture_ = minutesInFuture_;
                if (sectionSpeedBuilder_ == null) {
                    if (((bitField0_ & 0x00000002) == 0x00000002)) {
                        sectionSpeed_ = java.util.Collections.unmodifiableList(sectionSpeed_);
                        bitField0_ = (bitField0_ & ~0x00000002);
                    }
                    result.sectionSpeed_ = sectionSpeed_;
                } else {
                    result.sectionSpeed_ = sectionSpeedBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof SpeedVector) {
                    return mergeFrom((SpeedVector)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(SpeedVector other) {
                if (other == SpeedVector.getDefaultInstance()) return this;
                if (other.hasMinutesInFuture()) {
                    setMinutesInFuture(other.getMinutesInFuture());
                }
                if (sectionSpeedBuilder_ == null) {
                    if (!other.sectionSpeed_.isEmpty()) {
                        if (sectionSpeed_.isEmpty()) {
                            sectionSpeed_ = other.sectionSpeed_;
                            bitField0_ = (bitField0_ & ~0x00000002);
                        } else {
                            ensureSectionSpeedIsMutable();
                            sectionSpeed_.addAll(other.sectionSpeed_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.sectionSpeed_.isEmpty()) {
                        if (sectionSpeedBuilder_.isEmpty()) {
                            sectionSpeedBuilder_.dispose();
                            sectionSpeedBuilder_ = null;
                            sectionSpeed_ = other.sectionSpeed_;
                            bitField0_ = (bitField0_ & ~0x00000002);
                            sectionSpeedBuilder_ =
                                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                            getSectionSpeedFieldBuilder() : null;
                        } else {
                            sectionSpeedBuilder_.addAllMessages(other.sectionSpeed_);
                        }
                    }
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                SpeedVector parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (SpeedVector) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            private int minutesInFuture_ ;
            /**
             * <pre>
             * The minutes in future relative to the creation time of the complete flow data
             * the specified speed information is relevant. A value of 0 shall indicate the current
             * speed data.
             * </pre>
             *
             * <code>optional uint32 minutesInFuture = 1;</code>
             */
            public boolean hasMinutesInFuture() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <pre>
             * The minutes in future relative to the creation time of the complete flow data
             * the specified speed information is relevant. A value of 0 shall indicate the current
             * speed data.
             * </pre>
             *
             * <code>optional uint32 minutesInFuture = 1;</code>
             */
            public int getMinutesInFuture() {
                return minutesInFuture_;
            }
            /**
             * <pre>
             * The minutes in future relative to the creation time of the complete flow data
             * the specified speed information is relevant. A value of 0 shall indicate the current
             * speed data.
             * </pre>
             *
             * <code>optional uint32 minutesInFuture = 1;</code>
             */
            public Builder setMinutesInFuture(int value) {
                bitField0_ |= 0x00000001;
                minutesInFuture_ = value;
                onChanged();
                return this;
            }
            /**
             * <pre>
             * The minutes in future relative to the creation time of the complete flow data
             * the specified speed information is relevant. A value of 0 shall indicate the current
             * speed data.
             * </pre>
             *
             * <code>optional uint32 minutesInFuture = 1;</code>
             */
            public Builder clearMinutesInFuture() {
                bitField0_ = (bitField0_ & ~0x00000001);
                minutesInFuture_ = 0;
                onChanged();
                return this;
            }

            private java.util.List<SectionSpeed> sectionSpeed_ =
                    java.util.Collections.emptyList();
            private void ensureSectionSpeedIsMutable() {
                if (!((bitField0_ & 0x00000002) == 0x00000002)) {
                    sectionSpeed_ = new java.util.ArrayList<SectionSpeed>(sectionSpeed_);
                    bitField0_ |= 0x00000002;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    SectionSpeed, SectionSpeed.Builder, SectionSpeedOrBuilder> sectionSpeedBuilder_;

            /**
             * <pre>
             * List of speed parameters per section. The sections are ordered by start offset.
             * </pre>
             *
             * <code>repeated .model.traffic.SectionSpeed sectionSpeed = 2;</code>
             */
            public java.util.List<SectionSpeed> getSectionSpeedList() {
                if (sectionSpeedBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(sectionSpeed_);
                } else {
                    return sectionSpeedBuilder_.getMessageList();
                }
            }
            /**
             * <pre>
             * List of speed parameters per section. The sections are ordered by start offset.
             * </pre>
             *
             * <code>repeated .model.traffic.SectionSpeed sectionSpeed = 2;</code>
             */
            public int getSectionSpeedCount() {
                if (sectionSpeedBuilder_ == null) {
                    return sectionSpeed_.size();
                } else {
                    return sectionSpeedBuilder_.getCount();
                }
            }
            /**
             * <pre>
             * List of speed parameters per section. The sections are ordered by start offset.
             * </pre>
             *
             * <code>repeated .model.traffic.SectionSpeed sectionSpeed = 2;</code>
             */
            public SectionSpeed getSectionSpeed(int index) {
                if (sectionSpeedBuilder_ == null) {
                    return sectionSpeed_.get(index);
                } else {
                    return sectionSpeedBuilder_.getMessage(index);
                }
            }
            /**
             * <pre>
             * List of speed parameters per section. The sections are ordered by start offset.
             * </pre>
             *
             * <code>repeated .model.traffic.SectionSpeed sectionSpeed = 2;</code>
             */
            public Builder setSectionSpeed(
                    int index, SectionSpeed value) {
                if (sectionSpeedBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureSectionSpeedIsMutable();
                    sectionSpeed_.set(index, value);
                    onChanged();
                } else {
                    sectionSpeedBuilder_.setMessage(index, value);
                }
                return this;
            }
            /**
             * <pre>
             * List of speed parameters per section. The sections are ordered by start offset.
             * </pre>
             *
             * <code>repeated .model.traffic.SectionSpeed sectionSpeed = 2;</code>
             */
            public Builder setSectionSpeed(
                    int index, SectionSpeed.Builder builderForValue) {
                if (sectionSpeedBuilder_ == null) {
                    ensureSectionSpeedIsMutable();
                    sectionSpeed_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    sectionSpeedBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <pre>
             * List of speed parameters per section. The sections are ordered by start offset.
             * </pre>
             *
             * <code>repeated .model.traffic.SectionSpeed sectionSpeed = 2;</code>
             */
            public Builder addSectionSpeed(SectionSpeed value) {
                if (sectionSpeedBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureSectionSpeedIsMutable();
                    sectionSpeed_.add(value);
                    onChanged();
                } else {
                    sectionSpeedBuilder_.addMessage(value);
                }
                return this;
            }
            /**
             * <pre>
             * List of speed parameters per section. The sections are ordered by start offset.
             * </pre>
             *
             * <code>repeated .model.traffic.SectionSpeed sectionSpeed = 2;</code>
             */
            public Builder addSectionSpeed(
                    int index, SectionSpeed value) {
                if (sectionSpeedBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureSectionSpeedIsMutable();
                    sectionSpeed_.add(index, value);
                    onChanged();
                } else {
                    sectionSpeedBuilder_.addMessage(index, value);
                }
                return this;
            }
            /**
             * <pre>
             * List of speed parameters per section. The sections are ordered by start offset.
             * </pre>
             *
             * <code>repeated .model.traffic.SectionSpeed sectionSpeed = 2;</code>
             */
            public Builder addSectionSpeed(
                    SectionSpeed.Builder builderForValue) {
                if (sectionSpeedBuilder_ == null) {
                    ensureSectionSpeedIsMutable();
                    sectionSpeed_.add(builderForValue.build());
                    onChanged();
                } else {
                    sectionSpeedBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            /**
             * <pre>
             * List of speed parameters per section. The sections are ordered by start offset.
             * </pre>
             *
             * <code>repeated .model.traffic.SectionSpeed sectionSpeed = 2;</code>
             */
            public Builder addSectionSpeed(
                    int index, SectionSpeed.Builder builderForValue) {
                if (sectionSpeedBuilder_ == null) {
                    ensureSectionSpeedIsMutable();
                    sectionSpeed_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    sectionSpeedBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <pre>
             * List of speed parameters per section. The sections are ordered by start offset.
             * </pre>
             *
             * <code>repeated .model.traffic.SectionSpeed sectionSpeed = 2;</code>
             */
            public Builder addAllSectionSpeed(
                    Iterable<? extends SectionSpeed> values) {
                if (sectionSpeedBuilder_ == null) {
                    ensureSectionSpeedIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(
                            values, sectionSpeed_);
                    onChanged();
                } else {
                    sectionSpeedBuilder_.addAllMessages(values);
                }
                return this;
            }
            /**
             * <pre>
             * List of speed parameters per section. The sections are ordered by start offset.
             * </pre>
             *
             * <code>repeated .model.traffic.SectionSpeed sectionSpeed = 2;</code>
             */
            public Builder clearSectionSpeed() {
                if (sectionSpeedBuilder_ == null) {
                    sectionSpeed_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000002);
                    onChanged();
                } else {
                    sectionSpeedBuilder_.clear();
                }
                return this;
            }
            /**
             * <pre>
             * List of speed parameters per section. The sections are ordered by start offset.
             * </pre>
             *
             * <code>repeated .model.traffic.SectionSpeed sectionSpeed = 2;</code>
             */
            public Builder removeSectionSpeed(int index) {
                if (sectionSpeedBuilder_ == null) {
                    ensureSectionSpeedIsMutable();
                    sectionSpeed_.remove(index);
                    onChanged();
                } else {
                    sectionSpeedBuilder_.remove(index);
                }
                return this;
            }
            /**
             * <pre>
             * List of speed parameters per section. The sections are ordered by start offset.
             * </pre>
             *
             * <code>repeated .model.traffic.SectionSpeed sectionSpeed = 2;</code>
             */
            public SectionSpeed.Builder getSectionSpeedBuilder(
                    int index) {
                return getSectionSpeedFieldBuilder().getBuilder(index);
            }
            /**
             * <pre>
             * List of speed parameters per section. The sections are ordered by start offset.
             * </pre>
             *
             * <code>repeated .model.traffic.SectionSpeed sectionSpeed = 2;</code>
             */
            public SectionSpeedOrBuilder getSectionSpeedOrBuilder(
                    int index) {
                if (sectionSpeedBuilder_ == null) {
                    return sectionSpeed_.get(index);  } else {
                    return sectionSpeedBuilder_.getMessageOrBuilder(index);
                }
            }
            /**
             * <pre>
             * List of speed parameters per section. The sections are ordered by start offset.
             * </pre>
             *
             * <code>repeated .model.traffic.SectionSpeed sectionSpeed = 2;</code>
             */
            public java.util.List<? extends SectionSpeedOrBuilder>
            getSectionSpeedOrBuilderList() {
                if (sectionSpeedBuilder_ != null) {
                    return sectionSpeedBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(sectionSpeed_);
                }
            }
            /**
             * <pre>
             * List of speed parameters per section. The sections are ordered by start offset.
             * </pre>
             *
             * <code>repeated .model.traffic.SectionSpeed sectionSpeed = 2;</code>
             */
            public SectionSpeed.Builder addSectionSpeedBuilder() {
                return getSectionSpeedFieldBuilder().addBuilder(
                        SectionSpeed.getDefaultInstance());
            }
            /**
             * <pre>
             * List of speed parameters per section. The sections are ordered by start offset.
             * </pre>
             *
             * <code>repeated .model.traffic.SectionSpeed sectionSpeed = 2;</code>
             */
            public SectionSpeed.Builder addSectionSpeedBuilder(
                    int index) {
                return getSectionSpeedFieldBuilder().addBuilder(
                        index, SectionSpeed.getDefaultInstance());
            }
            /**
             * <pre>
             * List of speed parameters per section. The sections are ordered by start offset.
             * </pre>
             *
             * <code>repeated .model.traffic.SectionSpeed sectionSpeed = 2;</code>
             */
            public java.util.List<SectionSpeed.Builder>
            getSectionSpeedBuilderList() {
                return getSectionSpeedFieldBuilder().getBuilderList();
            }
            private com.google.protobuf.RepeatedFieldBuilderV3<
                    SectionSpeed, SectionSpeed.Builder, SectionSpeedOrBuilder>
            getSectionSpeedFieldBuilder() {
                if (sectionSpeedBuilder_ == null) {
                    sectionSpeedBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                            SectionSpeed, SectionSpeed.Builder, SectionSpeedOrBuilder>(
                            sectionSpeed_,
                            ((bitField0_ & 0x00000002) == 0x00000002),
                            getParentForChildren(),
                            isClean());
                    sectionSpeed_ = null;
                }
                return sectionSpeedBuilder_;
            }
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:model.traffic.SpeedVector)
        }

        // @@protoc_insertion_point(class_scope:model.traffic.SpeedVector)
        private static final SpeedVector DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new SpeedVector();
        }

        public static SpeedVector getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @Deprecated public static final com.google.protobuf.Parser<SpeedVector>
                PARSER = new com.google.protobuf.AbstractParser<SpeedVector>() {
            public SpeedVector parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new SpeedVector(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<SpeedVector> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<SpeedVector> getParserForType() {
            return PARSER;
        }

        public SpeedVector getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface SectionSpeedOrBuilder extends
            // @@protoc_insertion_point(interface_extends:model.traffic.SectionSpeed)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <pre>
         * Start offset of the section in meters. This offset value is relative to the start of the
         * location (or in TMC terms: the secondary location).
         * </pre>
         *
         * <code>optional uint32 startOffsetInMeters = 1;</code>
         */
        boolean hasStartOffsetInMeters();
        /**
         * <pre>
         * Start offset of the section in meters. This offset value is relative to the start of the
         * location (or in TMC terms: the secondary location).
         * </pre>
         *
         * <code>optional uint32 startOffsetInMeters = 1;</code>
         */
        int getStartOffsetInMeters();

        /**
         * <pre>
         * Speed information for section.
         * </pre>
         *
         * <code>optional .model.traffic.Speed speed = 2;</code>
         */
        boolean hasSpeed();
        /**
         * <pre>
         * Speed information for section.
         * </pre>
         *
         * <code>optional .model.traffic.Speed speed = 2;</code>
         */
        Speed getSpeed();
        /**
         * <pre>
         * Speed information for section.
         * </pre>
         *
         * <code>optional .model.traffic.Speed speed = 2;</code>
         */
        SpeedOrBuilder getSpeedOrBuilder();

        /**
         * <pre>
         * Flag indicating road closures.
         * </pre>
         *
         * <code>optional bool roadClosure = 3 [default = false];</code>
         */
        boolean hasRoadClosure();
        /**
         * <pre>
         * Flag indicating road closures.
         * </pre>
         *
         * <code>optional bool roadClosure = 3 [default = false];</code>
         */
        boolean getRoadClosure();
    }
    /**
     * <pre>
     * Combines a Speed message with an offset value. The speed is only relevant for the location part
     * starting at the specified offset and ending at the start offset of the succeeding section or the
     * end of the location in case of the last section.
     * </pre>
     *
     * Protobuf type {@code model.traffic.SectionSpeed}
     */
    public  static final class SectionSpeed extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:model.traffic.SectionSpeed)
            SectionSpeedOrBuilder {
        // Use SectionSpeed.newBuilder() to construct.
        private SectionSpeed(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private SectionSpeed() {
            startOffsetInMeters_ = 0;
            roadClosure_ = false;
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private SectionSpeed(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            int mutable_bitField0_ = 0;
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {
                            bitField0_ |= 0x00000001;
                            startOffsetInMeters_ = input.readUInt32();
                            break;
                        }
                        case 18: {
                            Speed.Builder subBuilder = null;
                            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                                subBuilder = speed_.toBuilder();
                            }
                            speed_ = input.readMessage(Speed.PARSER, extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(speed_);
                                speed_ = subBuilder.buildPartial();
                            }
                            bitField0_ |= 0x00000002;
                            break;
                        }
                        case 24: {
                            bitField0_ |= 0x00000004;
                            roadClosure_ = input.readBool();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return ProtobufTrafficFlowV5.internal_static_model_traffic_SectionSpeed_descriptor;
        }

        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return ProtobufTrafficFlowV5.internal_static_model_traffic_SectionSpeed_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            SectionSpeed.class, Builder.class);
        }

        private int bitField0_;
        public static final int STARTOFFSETINMETERS_FIELD_NUMBER = 1;
        private int startOffsetInMeters_;
        /**
         * <pre>
         * Start offset of the section in meters. This offset value is relative to the start of the
         * location (or in TMC terms: the secondary location).
         * </pre>
         *
         * <code>optional uint32 startOffsetInMeters = 1;</code>
         */
        public boolean hasStartOffsetInMeters() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }
        /**
         * <pre>
         * Start offset of the section in meters. This offset value is relative to the start of the
         * location (or in TMC terms: the secondary location).
         * </pre>
         *
         * <code>optional uint32 startOffsetInMeters = 1;</code>
         */
        public int getStartOffsetInMeters() {
            return startOffsetInMeters_;
        }

        public static final int SPEED_FIELD_NUMBER = 2;
        private Speed speed_;
        /**
         * <pre>
         * Speed information for section.
         * </pre>
         *
         * <code>optional .model.traffic.Speed speed = 2;</code>
         */
        public boolean hasSpeed() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }
        /**
         * <pre>
         * Speed information for section.
         * </pre>
         *
         * <code>optional .model.traffic.Speed speed = 2;</code>
         */
        public Speed getSpeed() {
            return speed_ == null ? Speed.getDefaultInstance() : speed_;
        }
        /**
         * <pre>
         * Speed information for section.
         * </pre>
         *
         * <code>optional .model.traffic.Speed speed = 2;</code>
         */
        public SpeedOrBuilder getSpeedOrBuilder() {
            return speed_ == null ? Speed.getDefaultInstance() : speed_;
        }

        public static final int ROADCLOSURE_FIELD_NUMBER = 3;
        private boolean roadClosure_;
        /**
         * <pre>
         * Flag indicating road closures.
         * </pre>
         *
         * <code>optional bool roadClosure = 3 [default = false];</code>
         */
        public boolean hasRoadClosure() {
            return ((bitField0_ & 0x00000004) == 0x00000004);
        }
        /**
         * <pre>
         * Flag indicating road closures.
         * </pre>
         *
         * <code>optional bool roadClosure = 3 [default = false];</code>
         */
        public boolean getRoadClosure() {
            return roadClosure_;
        }

        private byte memoizedIsInitialized = -1;
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeUInt32(1, startOffsetInMeters_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeMessage(2, getSpeed());
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                output.writeBool(3, roadClosure_);
            }
            unknownFields.writeTo(output);
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeUInt32Size(1, startOffsetInMeters_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(2, getSpeed());
            }
            if (((bitField0_ & 0x00000004) == 0x00000004)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBoolSize(3, roadClosure_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SectionSpeed)) {
                return super.equals(obj);
            }
            SectionSpeed other = (SectionSpeed) obj;

            boolean result = true;
            result = result && (hasStartOffsetInMeters() == other.hasStartOffsetInMeters());
            if (hasStartOffsetInMeters()) {
                result = result && (getStartOffsetInMeters()
                        == other.getStartOffsetInMeters());
            }
            result = result && (hasSpeed() == other.hasSpeed());
            if (hasSpeed()) {
                result = result && getSpeed()
                        .equals(other.getSpeed());
            }
            result = result && (hasRoadClosure() == other.hasRoadClosure());
            if (hasRoadClosure()) {
                result = result && (getRoadClosure()
                        == other.getRoadClosure());
            }
            result = result && unknownFields.equals(other.unknownFields);
            return result;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (hasStartOffsetInMeters()) {
                hash = (37 * hash) + STARTOFFSETINMETERS_FIELD_NUMBER;
                hash = (53 * hash) + getStartOffsetInMeters();
            }
            if (hasSpeed()) {
                hash = (37 * hash) + SPEED_FIELD_NUMBER;
                hash = (53 * hash) + getSpeed().hashCode();
            }
            if (hasRoadClosure()) {
                hash = (37 * hash) + ROADCLOSURE_FIELD_NUMBER;
                hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
                        getRoadClosure());
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static SectionSpeed parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SectionSpeed parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SectionSpeed parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SectionSpeed parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SectionSpeed parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static SectionSpeed parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static SectionSpeed parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static SectionSpeed parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static SectionSpeed parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static SectionSpeed parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static SectionSpeed parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static SectionSpeed parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(SectionSpeed prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(
                BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * <pre>
         * Combines a Speed message with an offset value. The speed is only relevant for the location part
         * starting at the specified offset and ending at the start offset of the succeeding section or the
         * end of the location in case of the last section.
         * </pre>
         *
         * Protobuf type {@code model.traffic.SectionSpeed}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:model.traffic.SectionSpeed)
                SectionSpeedOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return ProtobufTrafficFlowV5.internal_static_model_traffic_SectionSpeed_descriptor;
            }

            protected FieldAccessorTable
            internalGetFieldAccessorTable() {
                return ProtobufTrafficFlowV5.internal_static_model_traffic_SectionSpeed_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                SectionSpeed.class, Builder.class);
            }

            // Construct using model.traffic.ProtobufTrafficFlowV5.SectionSpeed.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }
            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                    getSpeedFieldBuilder();
                }
            }
            public Builder clear() {
                super.clear();
                startOffsetInMeters_ = 0;
                bitField0_ = (bitField0_ & ~0x00000001);
                if (speedBuilder_ == null) {
                    speed_ = null;
                } else {
                    speedBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000002);
                roadClosure_ = false;
                bitField0_ = (bitField0_ & ~0x00000004);
                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return ProtobufTrafficFlowV5.internal_static_model_traffic_SectionSpeed_descriptor;
            }

            public SectionSpeed getDefaultInstanceForType() {
                return SectionSpeed.getDefaultInstance();
            }

            public SectionSpeed build() {
                SectionSpeed result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public SectionSpeed buildPartial() {
                SectionSpeed result = new SectionSpeed(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.startOffsetInMeters_ = startOffsetInMeters_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                if (speedBuilder_ == null) {
                    result.speed_ = speed_;
                } else {
                    result.speed_ = speedBuilder_.build();
                }
                if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.roadClosure_ = roadClosure_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof SectionSpeed) {
                    return mergeFrom((SectionSpeed)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(SectionSpeed other) {
                if (other == SectionSpeed.getDefaultInstance()) return this;
                if (other.hasStartOffsetInMeters()) {
                    setStartOffsetInMeters(other.getStartOffsetInMeters());
                }
                if (other.hasSpeed()) {
                    mergeSpeed(other.getSpeed());
                }
                if (other.hasRoadClosure()) {
                    setRoadClosure(other.getRoadClosure());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                SectionSpeed parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (SectionSpeed) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            private int startOffsetInMeters_ ;
            /**
             * <pre>
             * Start offset of the section in meters. This offset value is relative to the start of the
             * location (or in TMC terms: the secondary location).
             * </pre>
             *
             * <code>optional uint32 startOffsetInMeters = 1;</code>
             */
            public boolean hasStartOffsetInMeters() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }
            /**
             * <pre>
             * Start offset of the section in meters. This offset value is relative to the start of the
             * location (or in TMC terms: the secondary location).
             * </pre>
             *
             * <code>optional uint32 startOffsetInMeters = 1;</code>
             */
            public int getStartOffsetInMeters() {
                return startOffsetInMeters_;
            }
            /**
             * <pre>
             * Start offset of the section in meters. This offset value is relative to the start of the
             * location (or in TMC terms: the secondary location).
             * </pre>
             *
             * <code>optional uint32 startOffsetInMeters = 1;</code>
             */
            public Builder setStartOffsetInMeters(int value) {
                bitField0_ |= 0x00000001;
                startOffsetInMeters_ = value;
                onChanged();
                return this;
            }
            /**
             * <pre>
             * Start offset of the section in meters. This offset value is relative to the start of the
             * location (or in TMC terms: the secondary location).
             * </pre>
             *
             * <code>optional uint32 startOffsetInMeters = 1;</code>
             */
            public Builder clearStartOffsetInMeters() {
                bitField0_ = (bitField0_ & ~0x00000001);
                startOffsetInMeters_ = 0;
                onChanged();
                return this;
            }

            private Speed speed_ = null;
            private com.google.protobuf.SingleFieldBuilderV3<
                    Speed, Speed.Builder, SpeedOrBuilder> speedBuilder_;
            /**
             * <pre>
             * Speed information for section.
             * </pre>
             *
             * <code>optional .model.traffic.Speed speed = 2;</code>
             */
            public boolean hasSpeed() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }
            /**
             * <pre>
             * Speed information for section.
             * </pre>
             *
             * <code>optional .model.traffic.Speed speed = 2;</code>
             */
            public Speed getSpeed() {
                if (speedBuilder_ == null) {
                    return speed_ == null ? Speed.getDefaultInstance() : speed_;
                } else {
                    return speedBuilder_.getMessage();
                }
            }
            /**
             * <pre>
             * Speed information for section.
             * </pre>
             *
             * <code>optional .model.traffic.Speed speed = 2;</code>
             */
            public Builder setSpeed(Speed value) {
                if (speedBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    speed_ = value;
                    onChanged();
                } else {
                    speedBuilder_.setMessage(value);
                }
                bitField0_ |= 0x00000002;
                return this;
            }
            /**
             * <pre>
             * Speed information for section.
             * </pre>
             *
             * <code>optional .model.traffic.Speed speed = 2;</code>
             */
            public Builder setSpeed(
                    Speed.Builder builderForValue) {
                if (speedBuilder_ == null) {
                    speed_ = builderForValue.build();
                    onChanged();
                } else {
                    speedBuilder_.setMessage(builderForValue.build());
                }
                bitField0_ |= 0x00000002;
                return this;
            }
            /**
             * <pre>
             * Speed information for section.
             * </pre>
             *
             * <code>optional .model.traffic.Speed speed = 2;</code>
             */
            public Builder mergeSpeed(Speed value) {
                if (speedBuilder_ == null) {
                    if (((bitField0_ & 0x00000002) == 0x00000002) &&
                            speed_ != null &&
                            speed_ != Speed.getDefaultInstance()) {
                        speed_ =
                                Speed.newBuilder(speed_).mergeFrom(value).buildPartial();
                    } else {
                        speed_ = value;
                    }
                    onChanged();
                } else {
                    speedBuilder_.mergeFrom(value);
                }
                bitField0_ |= 0x00000002;
                return this;
            }
            /**
             * <pre>
             * Speed information for section.
             * </pre>
             *
             * <code>optional .model.traffic.Speed speed = 2;</code>
             */
            public Builder clearSpeed() {
                if (speedBuilder_ == null) {
                    speed_ = null;
                    onChanged();
                } else {
                    speedBuilder_.clear();
                }
                bitField0_ = (bitField0_ & ~0x00000002);
                return this;
            }
            /**
             * <pre>
             * Speed information for section.
             * </pre>
             *
             * <code>optional .model.traffic.Speed speed = 2;</code>
             */
            public Speed.Builder getSpeedBuilder() {
                bitField0_ |= 0x00000002;
                onChanged();
                return getSpeedFieldBuilder().getBuilder();
            }
            /**
             * <pre>
             * Speed information for section.
             * </pre>
             *
             * <code>optional .model.traffic.Speed speed = 2;</code>
             */
            public SpeedOrBuilder getSpeedOrBuilder() {
                if (speedBuilder_ != null) {
                    return speedBuilder_.getMessageOrBuilder();
                } else {
                    return speed_ == null ?
                            Speed.getDefaultInstance() : speed_;
                }
            }
            /**
             * <pre>
             * Speed information for section.
             * </pre>
             *
             * <code>optional .model.traffic.Speed speed = 2;</code>
             */
            private com.google.protobuf.SingleFieldBuilderV3<
                    Speed, Speed.Builder, SpeedOrBuilder>
            getSpeedFieldBuilder() {
                if (speedBuilder_ == null) {
                    speedBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
                            Speed, Speed.Builder, SpeedOrBuilder>(
                            getSpeed(),
                            getParentForChildren(),
                            isClean());
                    speed_ = null;
                }
                return speedBuilder_;
            }

            private boolean roadClosure_ ;
            /**
             * <pre>
             * Flag indicating road closures.
             * </pre>
             *
             * <code>optional bool roadClosure = 3 [default = false];</code>
             */
            public boolean hasRoadClosure() {
                return ((bitField0_ & 0x00000004) == 0x00000004);
            }
            /**
             * <pre>
             * Flag indicating road closures.
             * </pre>
             *
             * <code>optional bool roadClosure = 3 [default = false];</code>
             */
            public boolean getRoadClosure() {
                return roadClosure_;
            }
            /**
             * <pre>
             * Flag indicating road closures.
             * </pre>
             *
             * <code>optional bool roadClosure = 3 [default = false];</code>
             */
            public Builder setRoadClosure(boolean value) {
                bitField0_ |= 0x00000004;
                roadClosure_ = value;
                onChanged();
                return this;
            }
            /**
             * <pre>
             * Flag indicating road closures.
             * </pre>
             *
             * <code>optional bool roadClosure = 3 [default = false];</code>
             */
            public Builder clearRoadClosure() {
                bitField0_ = (bitField0_ & ~0x00000004);
                roadClosure_ = false;
                onChanged();
                return this;
            }
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:model.traffic.SectionSpeed)
        }

        // @@protoc_insertion_point(class_scope:model.traffic.SectionSpeed)
        private static final SectionSpeed DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new SectionSpeed();
        }

        public static SectionSpeed getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @Deprecated public static final com.google.protobuf.Parser<SectionSpeed>
                PARSER = new com.google.protobuf.AbstractParser<SectionSpeed>() {
            public SectionSpeed parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new SectionSpeed(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<SectionSpeed> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<SectionSpeed> getParserForType() {
            return PARSER;
        }

        public SectionSpeed getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_model_traffic_TrafficFlowGroup_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_model_traffic_TrafficFlowGroup_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_model_traffic_MetaInformation_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_model_traffic_MetaInformation_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_model_traffic_SupplierAndClientInfo_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_model_traffic_SupplierAndClientInfo_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_model_traffic_TrafficFlow_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_model_traffic_TrafficFlow_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_model_traffic_TrafficFlowWithPrediction_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_model_traffic_TrafficFlowWithPrediction_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_model_traffic_TrafficFlowWithPredictionPerSection_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_model_traffic_TrafficFlowWithPredictionPerSection_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_model_traffic_Location_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_model_traffic_Location_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_model_traffic_Speed_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_model_traffic_Speed_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_model_traffic_SpeedWithTimeStamp_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_model_traffic_SpeedWithTimeStamp_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_model_traffic_SpeedVector_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_model_traffic_SpeedVector_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_model_traffic_SectionSpeed_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_model_traffic_SectionSpeed_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }
    private static  com.google.protobuf.Descriptors.FileDescriptor
            descriptor;
    static {
        String[] descriptorData = {
                "\n\034ProtobufTrafficFlow_v5.proto\022\rmodel.tr" +
                        "affic\"\252\002\n\020TrafficFlowGroup\0227\n\017metaInform" +
                        "ation\030\001 \001(\0132\036.model.traffic.MetaInformat" +
                        "ion\022/\n\013trafficFlow\030\002 \003(\0132\032.model.traffic" +
                        ".TrafficFlow\022K\n\031trafficFlowWithPredictio" +
                        "n\030\003 \003(\0132(.model.traffic.TrafficFlowWithP" +
                        "rediction\022_\n#trafficFlowWithPredictionPe" +
                        "rSection\030\004 \003(\01322.model.traffic.TrafficFl" +
                        "owWithPredictionPerSection\"\213\001\n\017MetaInfor" +
                        "mation\022\034\n\024createTimeUTCSeconds\030\001 \001(\r\022C\n\025",
                "supplierAndClientInfo\030\002 \001(\0132$.model.traf" +
                        "fic.SupplierAndClientInfo\022\025\n\rformatVersi" +
                        "on\030\003 \001(\005\"=\n\025SupplierAndClientInfo\022\020\n\010cli" +
                        "entID\030\001 \001(\t\022\022\n\nsupplierID\030\002 \001(\t\"y\n\013Traff" +
                        "icFlow\022)\n\010location\030\001 \001(\0132\027.model.traffic" +
                        ".Location\022#\n\005speed\030\002 \001(\0132\024.model.traffic" +
                        ".Speed\022\032\n\013roadClosure\030\003 \001(\010:\005false\"\262\001\n\031T" +
                        "rafficFlowWithPrediction\022)\n\010location\030\001 \001" +
                        "(\0132\027.model.traffic.Location\0220\n\005speed\030\002 \003" +
                        "(\0132!.model.traffic.SpeedWithTimeStamp\022\032\n",
                "\013roadClosure\030\003 \001(\010:\005false\022\034\n\024timeToUsual" +
                        "InMinutes\030\004 \001(\r\"\237\001\n#TrafficFlowWithPredi" +
                        "ctionPerSection\022)\n\010location\030\001 \001(\0132\027.mode" +
                        "l.traffic.Location\022/\n\013speedVector\030\002 \003(\0132" +
                        "\032.model.traffic.SpeedVector\022\034\n\024timeToUsu" +
                        "alInMinutes\030\003 \001(\r\"?\n\010Location\022\013\n\003tmc\030\001 \001" +
                        "(\t\022\016\n\006openlr\030\002 \001(\014\022\026\n\016lengthInMeters\030\003 \001" +
                        "(\r\"\273\001\n\005Speed\022\030\n\020averageSpeedKmph\030\001 \001(\005\022\031" +
                        "\n\021travelTimeSeconds\030\002 \001(\005\022\022\n\nconfidence\030" +
                        "\003 \001(\005\022\025\n\rrelativeSpeed\030\004 \001(\002\0229\n\020trafficC",
                "ondition\030\005 \001(\0162\037.model.traffic.TrafficCo" +
                        "ndition\022\027\n\017averageSpeedMph\030\006 \001(\005\"R\n\022Spee" +
                        "dWithTimeStamp\022\027\n\017minutesInFuture\030\001 \001(\r\022" +
                        "#\n\005speed\030\002 \001(\0132\024.model.traffic.Speed\"Y\n\013" +
                        "SpeedVector\022\027\n\017minutesInFuture\030\001 \001(\r\0221\n\014" +
                        "sectionSpeed\030\002 \003(\0132\033.model.traffic.Secti" +
                        "onSpeed\"l\n\014SectionSpeed\022\033\n\023startOffsetIn" +
                        "Meters\030\001 \001(\r\022#\n\005speed\030\002 \001(\0132\024.model.traf" +
                        "fic.Speed\022\032\n\013roadClosure\030\003 \001(\010:\005false*\250\001" +
                        "\n\020TrafficCondition\022\027\n\023LONG_QUEUES_TRAFFI",
                "C\020\001\022\020\n\014FREE_TRAFFIC\020\002\022\021\n\rTRAFFIC_RED\020\003" +
                        "\022\020\n\014SLOW_TRAFFIC\020\004\022\023\n\017QUEUING_TRAFFIC\020\005\022" +
                        "\026\n\022STATIONARY_TRAFFIC\020\006\022\n\n\006CLOSED\020\007\022\013\n\007U" +
                        "NKNOWN\020\010"
        };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
                new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
                    public com.google.protobuf.ExtensionRegistry assignDescriptors(
                            com.google.protobuf.Descriptors.FileDescriptor root) {
                        descriptor = root;
                        return null;
                    }
                };
        com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                        }, assigner);
        internal_static_model_traffic_TrafficFlowGroup_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_model_traffic_TrafficFlowGroup_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_model_traffic_TrafficFlowGroup_descriptor,
                new String[] { "MetaInformation", "TrafficFlow", "TrafficFlowWithPrediction", "TrafficFlowWithPredictionPerSection", });
        internal_static_model_traffic_MetaInformation_descriptor =
                getDescriptor().getMessageTypes().get(1);
        internal_static_model_traffic_MetaInformation_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_model_traffic_MetaInformation_descriptor,
                new String[] { "CreateTimeUTCSeconds", "SupplierAndClientInfo", "FormatVersion", });
        internal_static_model_traffic_SupplierAndClientInfo_descriptor =
                getDescriptor().getMessageTypes().get(2);
        internal_static_model_traffic_SupplierAndClientInfo_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_model_traffic_SupplierAndClientInfo_descriptor,
                new String[] { "ClientID", "SupplierID", });
        internal_static_model_traffic_TrafficFlow_descriptor =
                getDescriptor().getMessageTypes().get(3);
        internal_static_model_traffic_TrafficFlow_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_model_traffic_TrafficFlow_descriptor,
                new String[] { "Location", "Speed", "RoadClosure", });
        internal_static_model_traffic_TrafficFlowWithPrediction_descriptor =
                getDescriptor().getMessageTypes().get(4);
        internal_static_model_traffic_TrafficFlowWithPrediction_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_model_traffic_TrafficFlowWithPrediction_descriptor,
                new String[] { "Location", "Speed", "RoadClosure", "TimeToUsualInMinutes", });
        internal_static_model_traffic_TrafficFlowWithPredictionPerSection_descriptor =
                getDescriptor().getMessageTypes().get(5);
        internal_static_model_traffic_TrafficFlowWithPredictionPerSection_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_model_traffic_TrafficFlowWithPredictionPerSection_descriptor,
                new String[] { "Location", "SpeedVector", "TimeToUsualInMinutes", });
        internal_static_model_traffic_Location_descriptor =
                getDescriptor().getMessageTypes().get(6);
        internal_static_model_traffic_Location_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_model_traffic_Location_descriptor,
                new String[] { "Tmc", "Openlr", "LengthInMeters", });
        internal_static_model_traffic_Speed_descriptor =
                getDescriptor().getMessageTypes().get(7);
        internal_static_model_traffic_Speed_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_model_traffic_Speed_descriptor,
                new String[] { "AverageSpeedKmph", "TravelTimeSeconds", "Confidence", "RelativeSpeed", "TrafficCondition", "AverageSpeedMph", });
        internal_static_model_traffic_SpeedWithTimeStamp_descriptor =
                getDescriptor().getMessageTypes().get(8);
        internal_static_model_traffic_SpeedWithTimeStamp_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_model_traffic_SpeedWithTimeStamp_descriptor,
                new String[] { "MinutesInFuture", "Speed", });
        internal_static_model_traffic_SpeedVector_descriptor =
                getDescriptor().getMessageTypes().get(9);
        internal_static_model_traffic_SpeedVector_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_model_traffic_SpeedVector_descriptor,
                new String[] { "MinutesInFuture", "SectionSpeed", });
        internal_static_model_traffic_SectionSpeed_descriptor =
                getDescriptor().getMessageTypes().get(10);
        internal_static_model_traffic_SectionSpeed_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_model_traffic_SectionSpeed_descriptor,
                new String[] { "StartOffsetInMeters", "Speed", "RoadClosure", });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
